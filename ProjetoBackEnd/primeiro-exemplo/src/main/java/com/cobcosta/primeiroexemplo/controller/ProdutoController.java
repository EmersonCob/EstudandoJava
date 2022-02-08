package com.cobcosta.primeiroexemplo.controller;

import java.util.List;
import java.util.Optional;

import com.cobcosta.primeiroexemplo.model.Produto;
import com.cobcosta.primeiroexemplo.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Toda vez que se cria um controller é necessario informar para o spring que ele é um controlador com essa anotação.
@RequestMapping("/api/produtos") // Informar qual rota que é ele precisa ouvir.
public class ProdutoController {
    
    @Autowired // Para ele ter o controle e conseguir usar aqui.
    private ProdutoService produtoService;

    @GetMapping // Quando alguém fizer um Get para "api/produtos" eu quero que chame esse metodo.
    public List<Produto> obterTodos(){
        return produtoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable Integer id){
        return produtoService.obterPorId(id);
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){
        return produtoService.adicionar(produto);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id){
        produtoService.deletar(id);
        return "Produto com id: " + id + " foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto, @PathVariable Integer id){
        return produtoService.atualizar(id, produto);
    }
}
