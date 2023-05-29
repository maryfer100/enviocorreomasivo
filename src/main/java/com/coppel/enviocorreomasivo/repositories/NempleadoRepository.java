package com.coppel.enviocorreomasivo.repositories;

import com.coppel.enviocorreomasivo.entities.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

//import java.util.List;
@Transactional
public interface NempleadoRepository extends JpaRepository<Empleados, String> {
    @Query(value = "INSERT INTO tbEmpleados (numemp) VALUES(?1);", nativeQuery = true)
    String AddEmpleado(Double dEmpleado);
}
