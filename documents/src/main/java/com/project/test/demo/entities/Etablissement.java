package com.project.test.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etablissement_id")
    private int id_etablissement;
    @Column(nullable = false)
    private String nom_etabli;
    private String descript_etabli;
    @Column(nullable = false)
    private String logo;
    private int etat_etabli;
    private String create_at;
    private String update_at;
    private String delete_at;
}
