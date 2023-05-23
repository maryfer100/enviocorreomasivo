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

    @Column (name= "numerocentro")
    private Integer numerocentro;

    @Column(name = "centro")
    private String  centro;

    @Column(name = "puesto")
    private String  puesto;

    @Column (name = "empresa")
    private short empresa;

    @Column(name = "enviado")
    private short enviado;
}