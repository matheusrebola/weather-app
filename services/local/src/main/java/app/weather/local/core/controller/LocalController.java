package app.weather.local.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/local")
@RequiredArgsConstructor
public class LocalController {

    @PostMapping
    public void receberUsuario(){

    }

    @PutMapping("/{id}")
    public void atualizarUsuario(@PathVariable String id){

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
