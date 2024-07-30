package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.ProBiblioteca.modelo.Autor;
import com.biblioteca.ProBiblioteca.repositorio.IAutorRepositorio;


@Service
public class AutorServicio implements IAutorServicio{

    @Autowired
    private IAutorRepositorio autorRepositorio;

    @Override
    public List<Autor> listarAutores() {
        List<Autor> autores = autorRepositorio.findAll();
        return autores;
    }

    @Override
    public Optional<Autor> obtenerAutorPorId(Integer id) {
        return autorRepositorio.findById(id);
    }

    @Override
    public void guardarAutor(Autor autor) {
        autorRepositorio.save(autor);
    }

    @Override
    public void eliminarAutor(Autor autor) {
        autorRepositorio.delete(autor);
    }

}
