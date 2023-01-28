package com.project.test.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "niveau_id")
    private int id_niveau;
    @Column(nullable = false)
    private String nom_niveau;
    private int etat_niveau;
    private String create_at;
    private String update_at;
    private String delete_at;
}
