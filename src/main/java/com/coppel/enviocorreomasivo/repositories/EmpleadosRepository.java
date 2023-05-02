package com.coppel.enviocorreomasivo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;


import com.coppel.enviocorreomasivo.entities.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, List<Integer>> {
   @Query(value="SELECT  * FROM FnInfoEmpleados(?1);", nativeQuery = true)
    Integer getInfoEmpleados(List<Integer> aEmpleados);
    
    //@Query(value="SELECT  * FROM FnInfoEmpleados(opt,String_to_array(?1, ','))", nativeQuery = true)
    //Integer getInfoEmpleados(String aEmpleados);

    //@Query(value = "select * from users where jsonb_exists_any(opts, string_to_array(?1, ','))", nativeQuery = true)
    //List<Users> findUsers(String listStringSeparatedByComma);
    
    //@Query(value="select * from student where roll_no in (:rollNos)",native =true)
    //List<Object[]> selectStudents(@Param("rollNos") List<Integer> rollNos);
}
