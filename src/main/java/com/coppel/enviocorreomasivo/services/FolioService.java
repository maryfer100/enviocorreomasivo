package com.coppel.enviocorreomasivo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.enviocorreomasivo.repositories.FolioRepository;

@Service
public class FolioService {
    @Autowired
    FolioRepository folioRepository;

    public String getFolioUnico(){
        return folioRepository.getFolio();
    }
}
