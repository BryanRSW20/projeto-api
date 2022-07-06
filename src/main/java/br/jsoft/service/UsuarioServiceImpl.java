package br.jsoft.service;


import br.jsoft.model.Usuario;
import br.jsoft.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {


    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return null;
    }

    @Override
    public Usuario findById(Long id) {
        return null;
    }

    @Override
    public Usuario create(Usuario newUsuario) {
        return null;
    }

    @Override
    public Usuario update(Usuario updatedUsuario, Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
