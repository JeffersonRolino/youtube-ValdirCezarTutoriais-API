package com.github.jeffersonrolino.api.domain;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;
}
