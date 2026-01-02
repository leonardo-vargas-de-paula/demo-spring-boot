package com.example.demo.service;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }
}

