package br.jsoft.service;

import br.jsoft.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario create(Usuario newUsuario);
    public Usuario update(Usuario updatedUsuario, Long id);
    public void deleteById(Long id);
}
