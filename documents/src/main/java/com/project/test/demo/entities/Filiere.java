package com.project.test.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filiere_id", nullable = false)
    private int id_filiere;
    @Column(nullable = false)
    private String nom_filiere;
    private String description;
    @Column(nullable = false)
    private String photo;
    @Column(nullable = false)
    private int etat_filiere;
    private String create_at;
    private String update_at;
    private String delete_at;

}
