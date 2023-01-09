package com.coppel.enviocorreomasivo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.enviocorreomasivo.services.FolioService;

@RestController
@RequestMapping("/apifolio")
public class FolioController {

    @Autowired
    FolioService folioService;

    @GetMapping("folio")
    public String getFolio(){
        return folioService.getFolioUnico();

    }
}
