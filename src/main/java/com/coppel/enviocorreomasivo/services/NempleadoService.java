package com.coppel.enviocorreomasivo.services;

import com.coppel.enviocorreomasivo.repositories.NempleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NempleadoService {
    @Autowired
    NempleadoRepository nempleadoRepository;

    public String addEmpleados (Double dEmpleado)
    {
        return nempleadoRepository.AddEmpleado(dEmpleado);
    }

}
