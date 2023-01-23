package com.coppel.enviocorreomasivo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.enviocorreomasivo.entities.Empleados;
import com.coppel.enviocorreomasivo.repositories.EmpleadosRepository;

@Service
public class EmpleadosService {
   
    @Autowired
    EmpleadosRepository empleadosRepository;

    public List<Empleados> getInfoEmpleados(List<Integer> aEmpleados)
    {
            return empleadosRepository.getInfoEmpleados(aEmpleados);
    }
}
    