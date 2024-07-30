package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import com.biblioteca.ProBiblioteca.modelo.*;

public interface IAutorServicio {

    public List<Autor> listarAutores();

    public Optional<Autor> obtenerAutorPorId(Integer id);

    public void guardarAutor(Autor autor);

    public void eliminarAutor(Autor autor);
}
