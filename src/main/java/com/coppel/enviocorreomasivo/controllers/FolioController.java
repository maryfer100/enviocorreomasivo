package com.coppel.enviocorreomasivo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.enviocorreomasivo.services.FolioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/apifolio")
public class FolioController {

    @Autowired
    FolioService folioService;

    /**
     * @return
     */
    @GetMapping("folio")
    public String getFolio(){
        return folioService.getFolioUnico();
    }
}
