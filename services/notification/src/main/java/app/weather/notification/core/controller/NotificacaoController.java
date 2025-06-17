package app.weather.notification.core.controller;

import org.springframework.web.bind.annotation.*;

public class NotificacaoController {

    @PostMapping
    public void criarNotificacao(){

    }

    @PutMapping("/{id}")
    public void atualizarNotificacao(@PathVariable String id){

    }

    @GetMapping
    public void buscarTodos(){

    }

    @GetMapping("/{id}")
    public void buscarPeloId(@PathVariable String id){

    }

    @DeleteMapping
    public void deletarTodos(){

    }

    @DeleteMapping("/{id}")
    public void deletarPeloId(@PathVariable String id){

    }
}
