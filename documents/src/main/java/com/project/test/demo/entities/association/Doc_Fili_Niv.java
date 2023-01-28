package com.project.test.demo.entities.association;

import com.project.test.demo.entities.Documents;
import com.project.test.demo.entities.Filiere;
import com.project.test.demo.entities.Niveau;
import com.project.test.demo.entities.key.Doc_fil_niv_Key;

import javax.persistence.*;

@Entity
public class Doc_Fili_Niv {
    @EmbeddedId
    private Doc_fil_niv_Key docFilNivKey;
    @ManyToOne
    @MapsId("document_id")
    @JoinColumn(name = "document_id")
    private Documents documents;
    @ManyToOne
    @MapsId("filiere_id")
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;
    @ManyToOne
    @MapsId("niveau_id")
    @JoinColumn(name = "niveau_id")
    private Niveau niveau;
}
