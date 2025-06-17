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

import java.util.List;
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
    public ResponseEntity<?> atualizar(@PathVariable String id, @RequestBody List<LocalDTO> dto){
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

    @PutMapping("/usuario/{id}")
    public ResponseEntity<?> atualizar(@PathVariable String id, @RequestBody UsuarioDTO dto){
        try{
            Usuario usuario = service.encontrarPeloId(id);
            if (usuario == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            service.salvar(mapper.map(usuario.getId(), dto));
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos(){
        try {
            List<Usuario> usuarios = service.encontrarTodos();
            if (usuarios.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            List<UsuarioDTO> dtos = mapper.map(usuarios);
            return new ResponseEntity<>(dtos, HttpStatus.OK);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPeloId(@PathVariable String id){
        try{
            Usuario usuario = service.encontrarPeloId(id);
            if (usuario == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(mapper.map(usuario), HttpStatus.OK);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping
    public ResponseEntity<?> deletarTodos(){
        try{
            service.deletarTodos();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPeloId(@PathVariable String id){
        try {
            service.deletarPeloId(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
