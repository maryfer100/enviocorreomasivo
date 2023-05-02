package com.coppel.enviocorreomasivo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coppel.enviocorreomasivo.entities.Empleados;
import com.coppel.enviocorreomasivo.services.EmpleadosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @Autowired
    EmpleadosService empleadosService;

    @GetMapping("info")
    @ResponseBody
     public Integer ObtenerInfoEmpleados(@RequestParam("aEmpleados") List<Integer> aEmpleados){
        //for (Integer empleados:aEmpleados) {
            //System.out.println(empleados);
        //}

        return empleadosService.getInfoEmpleados(aEmpleados); 
    }
}