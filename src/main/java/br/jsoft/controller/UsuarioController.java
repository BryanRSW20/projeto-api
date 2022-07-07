package br.jsoft.controller;

import br.jsoft.model.Usuario;
import br.jsoft.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("/usuario")
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.deleteById(id);
    }
}