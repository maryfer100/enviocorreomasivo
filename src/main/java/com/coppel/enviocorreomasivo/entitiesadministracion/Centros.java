package com.coppel.enviocorreomasivo.entitiesadministracion;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "catalogocentros")
public class Centros {
  @Id
   private Integer numerocentro;

   @Column(name = "nombrecentrro")
   private String nombrecentro;    
}
