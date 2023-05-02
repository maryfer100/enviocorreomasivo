package com.coppel.enviocorreomasivo.entities;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(name = "cmifoliounico_seq")
public class Folio {
    @Id
    // @Column(name = "folio")
    private String folio;
}
