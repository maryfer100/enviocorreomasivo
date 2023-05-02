package com.coppel.enviocorreomasivo.entities;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="cat_derechosutileriacorreomicro")
public class Login {
    @Id
    @Column(name="numemp")
    private Integer numemp;

    @Column(name="passw")
    private String passw;
}
