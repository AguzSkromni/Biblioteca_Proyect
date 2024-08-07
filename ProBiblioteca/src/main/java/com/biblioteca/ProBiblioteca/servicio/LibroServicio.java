package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biblioteca.ProBiblioteca.modelo.*;
import com.biblioteca.ProBiblioteca.repositorio.*;

@Service
public class LibroServicio implements ILibroServicio{

    @Autowired
    private ILibroRepositorio libroRespositorio;
    @Autowired
    private ICategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Libro> listarLibros() {
        List<Libro> libros = libroRespositorio.findAll();
        return libros;
    }

    @Override
    public Optional<Libro> obtenerLibroPorId(Integer id) {
        return libroRespositorio.findById(id);
    }

    @Override
    public void guardarLibro(Libro libro) {
        libroRespositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRespositorio.delete(libro);
    }

    @Override
    public List<Libro> listarLibrosPorCategoriaId(Integer idCategoria) {
        return libroRespositorio.findByCategoriaIdCategoria(idCategoria);
    }

}
