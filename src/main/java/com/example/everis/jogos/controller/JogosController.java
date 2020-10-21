package com.example.everis.jogos.controller;

import com.example.everis.jogos.dto.JogosDto;
import com.example.everis.jogos.entity.Jogos;
import com.example.everis.jogos.repository.JogosRepository;
import com.example.everis.jogos.service.JogosService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jogos")
public class JogosController {

    @Autowired
    private JogosService jogosService;

    @Autowired
    private JogosRepository jogosRepository;

    @ApiOperation(value = "Cadastrar jogo no banco de dados")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JogosDto criar(@RequestBody final JogosDto jogosDto){
        return jogosService.criar(jogosDto);
    }

    @ApiOperation(value = "Consultar jogo no banco de dados")
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Jogos buscar(@PathVariable final  Long id){
        return jogosService.buscar(id);
    }

    @ApiOperation(value = "Listar todos os jogos cadastrados no banco de dados")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Jogos> listar(){
        return jogosService.listar();

    }
    @ApiOperation(value = "Deletar jogo no banco de dados")
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable final Long id){
        jogosService.deletar(id);
    }

    @ApiOperation(value = "Atualizar jogo do banco de dados")
    @PutMapping("{id}")
    public void atualizar(@RequestBody final JogosDto jogosDto, @PathVariable final Long id){
        jogosService.atualizar(jogosDto, id);
    }
}

