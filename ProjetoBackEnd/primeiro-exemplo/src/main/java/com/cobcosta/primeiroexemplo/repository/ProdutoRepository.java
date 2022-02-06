package com.cobcosta.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.List;
import com.cobcosta.primeiroexemplo.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    public List<Produto> obterTodos(){
        return produtos;
    }

}
