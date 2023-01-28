package com.project.test.demo.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Doc_fil_niv_Key implements Serializable {
    @Column(nullable = false)
    private int document_id;
    @Column(nullable = false)
    private int filiere_id;
    @Column(nullable = false)
    private int niveau_id;

}
