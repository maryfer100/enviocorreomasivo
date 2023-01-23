package com.coppel.enviocorreomasivo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.enviocorreomasivo.entities.Empleados;
import com.coppel.enviocorreomasivo.services.EmpleadosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @Autowired
    EmpleadosService empleadosService;

    @GetMapping("info")
     public List<Empleados> ObtenerInfoEmpleados(List<Integer> aEmpleados){
        return empleadosService.getInfoEmpleados(aEmpleados); 
    }
}