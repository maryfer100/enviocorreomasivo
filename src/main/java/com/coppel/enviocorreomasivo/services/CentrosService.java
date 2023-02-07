package com.coppel.enviocorreomasivo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.enviocorreomasivo.repositoriesadministracion.CentrosRepository;

@Service
public class CentrosService {
   @Autowired
   CentrosRepository centrosRepository;
   public String getCentro()
   {
    return centrosRepository.getCentros();
   }

}
