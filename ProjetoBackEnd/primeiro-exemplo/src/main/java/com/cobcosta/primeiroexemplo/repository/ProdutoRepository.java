package com.cobcosta.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import com.cobcosta.primeiroexemplo.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para retornar uma lista de produtos
     * @return Lista de produtos.
    */
    public List<Produto> obterTodos(){
        return produtos;
    }

    /**
     * Metodo que retorna o produto encontrato pelo seu Id.
     * @param id do produto que será localizado.
     * @return Retorna um produto caso seja encontrado.
    */
    public Optional<Produto> obterPorId(Integer id){
        return produtos
                    .stream()
                    .filter(produtos -> produtos.getId() == id)
                    .findFirst();
    }

    /**
     * Metodo para adicionar produto na lista.
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
    */
    public Produto adicionar(Produto produto){

        ultimoId ++;

        produto.setId(ultimoId);
        produtos.add(produto);

        return produto;
    }

    /**
     * Metodo para deletar o produto por id.
     * @param id do produto a ser deletado.
    */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Metodo para atualizar o produto na lista.
     * @param produto que será atualizado.
     * @return Retorna o produto após atualizar na lista.
    */
    public Produto atualizar(Produto produto){
        
        // Encontra o produto na lista.
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto não encontrado.");
        }

        // Eu tenho que remover o produto antigo.
        deletar(produto.getId());

        // Depois adicionar o produto atualizado na lista.
        produtos.add(produto);

        return produto;
    }

}
