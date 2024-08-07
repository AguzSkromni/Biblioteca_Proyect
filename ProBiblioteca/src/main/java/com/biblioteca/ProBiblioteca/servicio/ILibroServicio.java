package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import com.biblioteca.ProBiblioteca.modelo.*;
import java.util.Optional;

public interface ILibroServicio {
    public List<Libro> listarLibros();

    public Optional<Libro> obtenerLibroPorId(Integer id);

    public void guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);

    //BUSQUEDA POR ID CATEGORIA
    List<Libro> listarLibrosPorCategoriaId(Integer idCategoria);
}
