package com.cobcosta.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import com.cobcosta.primeiroexemplo.model.Produto;
import com.cobcosta.primeiroexemplo.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retornar uma lista de produtos
     * @return Lista de produtos.
    */
    public List<Produto> obterTodos(){
        return produtoRepository.obterTodos();
    }

    /**
     * Metodo que retorna o produto encontrato pelo seu Id.
     * @param id do produto que será localizado.
     * @return Retorna um produto caso seja encontrado.
    */
    public Optional<Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);
    }

    /**
     * Metodo para adicionar produto na lista.
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
    */
    public Produto adicionar(Produto produto){
        // Poderia ter alguma regra de negocio aqui para validar o produto.
        return produtoRepository.adicionar(produto);
    }

    /**
     * Metodo para deletar o produto por id.
     * @param id do produto a ser deletado.
    */
    public void deletar(Integer id){
        // Aqui poderia ter alguma lógica de validação.
        produtoRepository.deletar(id);
    }

    /**
     * Metodo para atualizar o produto na lista.
     * @param produto que será atualizado.
     * @return Retorna o produto após atualizar na lista.
    */
    public Produto atualizar(Integer id, Produto produto){
        
        // Ter alguma validação no ID.
        produto.setId(id);

        return produtoRepository.atualizar(produto);
    }
}
