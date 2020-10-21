package com.example.everis.jogos.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Jogos")
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        private String nome;
        private String genero;
        private double preco;
        private String plataforma;

}
