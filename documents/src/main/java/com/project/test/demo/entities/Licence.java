package com.project.test.demo.entities;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Licence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "licence_id")
    private int id_licence;
    @Column(nullable = false)
    private String date_paye;
    @Column(nullable = false)
    private String date_expiration;
    private int etat_licence;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private String create_at;
    private String update_at;
    private String delete_at;
}
