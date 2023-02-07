package com.coppel.enviocorreomasivo.repositoriesadministracion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coppel.enviocorreomasivo.entitiesadministracion.Centros;

public interface CentrosRepository extends JpaRepository<Centros, String> {
    @Query(value = "SELECT  nombrecentro FROM catalogocentros where numerocentro = 230399;",nativeQuery = true)
    String getCentros();
}
