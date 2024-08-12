package com.biblioteca.ProBiblioteca.servicio;

import com.biblioteca.ProBiblioteca.modelo.Usuario;
import com.biblioteca.ProBiblioteca.repositorio.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio implements IUsuarioServicio {

    @Autowired
    private IUsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(Integer id) {
        return usuarioRepositorio.findById(id);
    }

    @Override
    public void guardarLibro(Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarLibro(Usuario usuario) {
        usuarioRepositorio.delete(usuario);
    }

    public Usuario obtenerUsuarioPorUsername(String username) {
        return usuarioRepositorio.findByUsername(username);
    }

}
