package com.cobcosta.primeiroexemplo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Toda vez que se cria um controller é necessario informar para o spring que ele é um controlador com essa anotação.
@RequestMapping("/api/produtos") // Informar qual rota que é ele precisa ouvir.
public class ProdutoController {
    
}
