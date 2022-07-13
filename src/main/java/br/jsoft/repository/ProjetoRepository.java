package br.jsoft.repository;

import br.jsoft.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository <Projeto, Long > {

}
