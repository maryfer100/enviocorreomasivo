package com.coppel.enviocorreomasivo.controllers;

import com.coppel.enviocorreomasivo.services.MemorandumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Text;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/apimemo")
public class MemorandumController {

    @Autowired
    MemorandumService memorandumService;

    @GetMapping("contador")
    public String getEmpleados(@RequestParam Integer emporigen, Integer centro, String sAsunto, String sTextoMemo){
        return memorandumService.getnumeroEmpleados(emporigen, centro, sAsunto, sTextoMemo);
    }
}
