package com.cobcosta.primeiroexemplo.services;

import java.util.List;

import com.cobcosta.primeiroexemplo.model.Produto;
import com.cobcosta.primeiroexemplo.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        return produtoRepository.obterTodos();
    }
}
