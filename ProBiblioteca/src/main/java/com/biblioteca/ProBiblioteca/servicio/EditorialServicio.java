package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.ProBiblioteca.modelo.*;
import com.biblioteca.ProBiblioteca.repositorio.IEditorialRepositorio;

public class EditorialServicio implements IEditorialServicio{

    @Autowired
    private IEditorialRepositorio editorialRepositorio;

    @Override
    public List<Editorial> listaEditoriales() {
        List<Editorial> editoriales;
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    @Override
    public Optional<Editorial> obtenerEditorialesPorId(Integer id) {
        return editorialRepositorio.findById(id);
    }

    @Override
    public void guardarEditoriales(Editorial editorial) {
        editorialRepositorio.save(editorial);
    }

    @Override
    public void eliminarEditoriales(Editorial editorial) {
        editorialRepositorio.delete(editorial);
    }

}
