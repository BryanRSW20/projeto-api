package br.jsoft.service;

import br.jsoft.model.Projeto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProjetoService {

    public List<Projeto> findAll();

    public Optional <Projeto> findById(Long id);

    public Projeto create(Projeto newProjeto);

    public Projeto update(Projeto updatedProjeto, Long id);

    public void deleteById(Long id);
}
