package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMensagem(){
        return "Teste repository";
    }
}
