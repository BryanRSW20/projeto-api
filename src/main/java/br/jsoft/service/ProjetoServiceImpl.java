package br.jsoft.service;

import br.jsoft.model.Projeto;
import br.jsoft.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoServiceImpl implements ProjetoService{

    @Autowired
    ProjetoRepository projetoRepository;

    @Override
    public List<Projeto> findAll(){
        return projetoRepository.findAll();
    };

    @Override
    public Optional<Projeto> findById(Long id){
        return projetoRepository.findById(id);
    }

    @Override
    public Projeto create(Projeto newProjeto){
        return projetoRepository.save(newProjeto);
    }

    @Override
    public Projeto update(Projeto updatedProjeto, Long id){
        Optional <Projeto> p = projetoRepository.findById(id);
        if(p.isEmpty()){
            return null;
        }

        p.get().setNome(updatedProjeto.getNome());
        p.get().setDescricao(updatedProjeto.getDescricao());
        p.get().setDataInicio(updatedProjeto.getDataInicio());
        p.get().setDataFinal(updatedProjeto.getDataFinal());
        return projetoRepository.save(p.get());
    }

    @Override
    public void deleteById(Long id){
        projetoRepository.deleteById(id);
    }
}
