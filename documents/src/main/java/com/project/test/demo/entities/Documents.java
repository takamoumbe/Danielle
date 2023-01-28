package com.project.test.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id", nullable = false)
    private int id_document;
    @Column(nullable = false)
    private String nom_document;
    @Column(nullable = false)
    private String type_document;
    private int etat_document;
    private String create_at;
    private String update_at;
    private String delete_at;
}
