package com.coppel.enviocorreomasivo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.enviocorreomasivo.services.LoginService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/apilogin")
public class LoginController {
    
    @Autowired
    LoginService loginService;

    @GetMapping("user")
    public Integer getUser(@RequestParam Integer numemp, String passw){
        return loginService.getEmpleado(numemp, passw);
    }

}
