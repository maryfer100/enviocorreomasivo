package com.coppel.enviocorreomasivo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coppel.enviocorreomasivo.entities.Folio;

public interface FolioRepository extends JpaRepository <Folio, String> {
    @Query(value = "SELECT fnpccmincrementarfoliounico AS folio FROM fnpccmincrementarfoliounico();", nativeQuery = true)
    String getFolio();
}
