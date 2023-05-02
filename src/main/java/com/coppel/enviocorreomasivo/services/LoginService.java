package com.coppel.enviocorreomasivo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.enviocorreomasivo.repositories.LoginRepository;

@Service
public class LoginService{
    @Autowired
    LoginRepository loginRepository;

    public Integer getEmpleado(Integer numemp, String passw)
    {
        return loginRepository.getNumemp(numemp, passw);
    }

    //public Character getFolio() {
     //   return null;
    //}
}