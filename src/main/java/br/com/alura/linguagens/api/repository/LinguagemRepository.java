package br.com.alura.linguagens.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.linguagens.api.dtos.Linguagem;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
    
}
