package com.project.test.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id_user;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String pass;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String status_user;
    @Column(nullable = false)
    private String type_user;
    private int etat_user;
    private String create_at;
    private String update_at;
    private String delete_at;
}
