package br.jsoft.controller;

import br.jsoft.model.Projeto;
import br.jsoft.service.ProjetoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjetoController {

    @Autowired
    ProjetoServiceImpl projetoService;

    @GetMapping("/projeto")
    public List<Projeto> findAll(){
        return projetoService.findAll();
    }

    @GetMapping("/projeto/{id}")
    public Optional <Projeto> findById(@PathVariable Long id){
        return projetoService.findById(id);
    }

    @PostMapping("/projeto")
    public Projeto create(@RequestBody Projeto projeto){
        return projetoService.create(projeto);
    }

    @PutMapping("/projeto/{id}")
    public Projeto update(@RequestBody Projeto projeto, @PathVariable long id){
        return projetoService.update(projeto, id);
    }

    @DeleteMapping("/projeto/{id}")
    public void delete(@PathVariable Long id){
        projetoService.deleteById(id);
    }
}
