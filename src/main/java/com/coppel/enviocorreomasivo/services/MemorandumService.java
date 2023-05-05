package com.coppel.enviocorreomasivo.services;

import com.coppel.enviocorreomasivo.repositories.MemorandumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemorandumService {
    @Autowired
    MemorandumRepository memorandumRepository;
    public String getnumeroEmpleados(Integer emporigen, Integer centro, String sAsunto, String sTextoMemo) {
        return memorandumRepository.getContador(emporigen, centro, sAsunto, sTextoMemo);
    }
}