package com.coppel.enviocorreomasivo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;


import com.coppel.enviocorreomasivo.entities.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, List<Integer>> {
    @Query(value="SELECT  * FROM FnInfoEmpleados(?1);", nativeQuery = true)
    List<Empleados> getInfoEmpleados(List<Integer> aEmpleados);
    
    //@Query(value="SELECT  * FROM FnInfoEmpleados(:aEmpleados);", nativeQuery = true)
    //List<Empleados> getInfoEmpleados(List<Integer> aEmpleados);
    
    //@Query(value="select * from student where roll_no in (:rollNos)",native =true)
    //List<Object[]> selectStudents(@Param("rollNos") List<Integer> rollNos);
}
