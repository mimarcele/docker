package com.example.everis.jogos.service;

import com.example.everis.jogos.dto.JogosDto;
import com.example.everis.jogos.exception.JogoNotFoundException;
import com.example.everis.jogos.entity.Jogos;
import com.example.everis.jogos.repository.JogosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class JogosService {

    @Autowired
    private JogosRepository jogosRepository;

    public JogosDto criar(JogosDto jogosDto){
        Jogos jogos = new Jogos();
        jogos.setNome(jogosDto.getNome());
        jogos.setGenero(jogosDto.getGenero());
        jogos.setPlataforma(jogosDto.getPlataforma());
        jogos.setPreco(jogosDto.getPreco());

        jogos = jogosRepository.save(jogos);
        jogosDto.setId(jogos.getId());
        return jogosDto;
    }
    public Jogos buscar(Long id){
        Optional<Jogos> jogos = jogosRepository.findById(id);

        if(!jogos.isPresent()){
        throw new JogoNotFoundException("Jogo " + id + " não encontrado");
        }
        return jogos.get();
    }

    public List<Jogos> listar(){
        List<Jogos> jogos = jogosRepository.findAll();
        return jogos;
    }

    public void deletar(Long id){
       Optional<Jogos> jogos = jogosRepository.findById(id);
        if(!jogos.isPresent()){
            throw new JogoNotFoundException("Jogo não encontrado");
        }
       jogosRepository.delete(jogos.get());
    }

    public void atualizar(JogosDto jogosDto, Long id){
        jogosRepository.findById(id)
                .map(jogos -> {
                    BeanUtils.copyProperties(jogosDto, jogos,"id");
                   jogosRepository.save(jogos);
                    return jogos;
                }).orElseThrow(()-> new JogoNotFoundException("Jogo não encontrado"));


    }

}