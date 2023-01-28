package com.project.test.demo.entities.association;

import com.project.test.demo.entities.Etablissement;
import com.project.test.demo.entities.Filiere;
import com.project.test.demo.entities.key.Eta_fil_key;

import javax.persistence.*;

@Entity
public class Filiere_etabli {
    @EmbeddedId
    Eta_fil_key etaFilKey;
    @ManyToOne()
    @MapsId("etablissement_id")
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;
    @ManyToOne()
    @MapsId("filiere_id")
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;
}
