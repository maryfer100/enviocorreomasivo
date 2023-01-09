package com.coppel.enviocorreomasivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coppel.enviocorreomasivo.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
    @Query(value = "SELECT  FnAccesoEnvioMasivo AS respuesta FROM FnAccesoEnvioMasivo(?1,?2);",nativeQuery = true)
    Integer getNumemp(Integer numemp, String passw);

    // @Query(value = "{call save_procedure(:marcaIn, :modeloIn, :anyoIn, :kmIn)}", nativeQuery = true)
    // void saveProcedure(
    //         @Param("marcaIn")String marcaIn,
    //         @Param("modeloIn")String modeloIn,
    //         @Param("anyoIn")int anyoIn,
    //         @Param("kmIn")int kmIn
    // );
}
