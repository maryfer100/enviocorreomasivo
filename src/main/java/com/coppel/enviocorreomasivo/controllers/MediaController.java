package com.coppel.enviocorreomasivo.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import com.coppel.enviocorreomasivo.services.NempleadoService;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.coppel.enviocorreomasivo.services.StorageService;

import lombok.AllArgsConstructor;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("media")
@AllArgsConstructor
public class MediaController {

    @Autowired
    NempleadoService nempleadoService;

    private final StorageService storageService;
    private final HttpServletRequest request;

    @PostMapping("upload")
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile multipartfile) {
        //Sube archivo excell a servidor
        String path = storageService.store(multipartfile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/media/")
                .path(path)
                .toUriString();
        //return Map.of("url",url);
        //Leer el archivo EXcell
        //List<Double> dEmpleados = null;
         //Integer result = 0;
        //String text = "";
        
        try {
                XSSFWorkbook workbook = new XSSFWorkbook(multipartfile.getInputStream());
                XSSFSheet sheet = workbook.getSheetAt(0);

                for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++)
                {
                    XSSFRow row = sheet.getRow(i);
                    XSSFCell cell = row.getCell(0);
                    //System.out.print("No.empleado: "+i+"  -  " + cell.getNumericCellValue());
                    //dEmpleados = Collections.singletonList(cell.getNumericCellValue());
                    nempleadoService.addEmpleados(cell.getNumericCellValue());
                     //result = AgregaEmpleados(cell.getNumericCellValue());
                    //System.out.print("Aqui esta el meollo: "+dEmpleados);
                }
           // result = AgregaEmpleados(dEmpleados);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

       // return Map.of("Success", lEmpleados);
        //if (result == 1){
             //text = "Archivo se subio exitosamente.";
       // }
        return Map.of("url",url);
    }

    @GetMapping("{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException {
        Resource file = storageService.LoadAsResource(filename);
        String contentType = Files.probeContentType(file.getFile().toPath());

        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }

    //public Integer AgregaEmpleados(double valor) throws IOException {
        //Integer tam = dEmpleados.size();
        //System.out.print("valor:" + valor);
        //String pb;
       // for (int i = 0; i < tam; i++) {
            //System.out.println(dEmpleados.get(i));
        //return nempleadoService.addEmpleados(valor);
        //nempleadoService.addEmpleados(dEmpleados);
        //}
    //}
}