package br.jsoft.repository;

import br.jsoft.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository< Usuario, Long > {}