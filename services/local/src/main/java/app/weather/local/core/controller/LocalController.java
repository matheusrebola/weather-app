package app.weather.local.core.controller;

import app.weather.local.core.document.Usuario;
import app.weather.local.core.dto.DispositivoDTO;
import app.weather.local.core.dto.LocalDTO;
import app.weather.local.core.dto.UsuarioDTO;
import app.weather.local.core.mapper.LocalMapper;
import app.weather.local.core.service.LocalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/local")
@RequiredArgsConstructor
public final class LocalController {
    private final LocalService service;
    private final LocalMapper mapper;

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody UsuarioDTO dto){
        Usuario usuario = mapper.map(dto);
        try{
            service.salvar(usuario);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (RuntimeException e) {
            //salvar no redis
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/dispositivo/{id}")
    public ResponseEntity<?> atualizar(@PathVariable String id, @RequestBody DispositivoDTO dto){
        try{
            Usuario usuario = service.encontrarPeloId(id);
            if (usuario == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            service.salvar(mapper.map(usuario, dto));
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/local/{id}")
    public void atualizar(@PathVariable String id, @RequestBody LocalDTO dto){

    }

    @PutMapping("/usuario/{id}")
    public void atualizar(@PathVariable String id, @RequestBody UsuarioDTO dto){

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
