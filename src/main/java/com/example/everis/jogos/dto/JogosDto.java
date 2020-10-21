package com.example.everis.jogos.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JogosDto {

    @ApiModelProperty(value = "Código do jogo")
    private Long id;

    private String nome;
    private String genero;
    private double preco;
    private String plataforma;

}
