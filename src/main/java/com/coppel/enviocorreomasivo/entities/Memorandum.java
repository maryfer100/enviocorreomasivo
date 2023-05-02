package com.coppel.enviocorreomasivo.entities;

import lombok.Data;
import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cmimemorandums")
public class Memorandum
{
   
    @Column(name="foliocentro")
    private Integer foliocentro;

   
    @Column(name="empleadoorigen")
    private Integer empleadoorigen;

    @Column(name="centroorigen")
    private Integer centroorigen;
    
    @Id
    @Column(name="foliomemorandum")
    private Integer foliomemorandum;

    @Column(name="contenidocorreo")
    private String contenidocorreo;

    @Column(name="ipusuario")
    private Integer ipusuario;

    @Column(name="claveorigen")
    private Integer claveorigen;

    @Column(name="des_asuntomemo")
    private Integer des_asuntomemo;
}