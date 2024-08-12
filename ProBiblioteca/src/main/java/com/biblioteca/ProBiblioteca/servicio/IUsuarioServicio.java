package com.biblioteca.ProBiblioteca.servicio;


import com.biblioteca.ProBiblioteca.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioServicio {
    List<Usuario> listarUsuario();

    Optional<Usuario> obtenerUsuarioPorId(Integer id);

    void guardarLibro(Usuario usuario);

    void eliminarLibro(Usuario usuario);
}