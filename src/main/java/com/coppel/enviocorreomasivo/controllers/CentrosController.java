package com.coppel.enviocorreomasivo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.enviocorreomasivo.services.CentrosService;

@RestController
@RequestMapping("/api")
public class CentrosController {
    @Autowired
    CentrosService centrosService;

    public String getCentros(){
        return centrosService.getCentro();
    }
    
}
