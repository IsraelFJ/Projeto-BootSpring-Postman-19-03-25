package com.example.NovoSringPostman.model;

import jakarta.persistence.*;
import lombok.Data; // lombok funciona para facilitar os metodos getters e setters

@Entity
@Table(name = "tab_usuario")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;
    private String email;
 /* private String email;
    private String email;*/

}
