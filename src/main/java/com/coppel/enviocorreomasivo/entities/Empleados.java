package com.coppel.enviocorreomasivo.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="tbEmpleados")
public class Empleados{
    @Id
    @Column(name="numemp")
    private Integer numemp;

    @Column(name = "nombre")
    private String  nombre;

    @Column(name = "centro")
    private String  centro;

    @Column(name = "puesto")
    private String  puesto;
}