package com.project.test.demo.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable // permet de rendre cela comme une cle composer
public class Eta_fil_key implements Serializable {
    @Column(nullable = false)
    private int filiere_id;
    @Column(nullable = false)
    private int etablissement_id;
}
