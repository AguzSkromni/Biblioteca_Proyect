package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.ProBiblioteca.modelo.Editoriales;
import com.biblioteca.ProBiblioteca.repositorio.IEditorialRepositorio;

public class EditorialesServicio implements IEditorialesServicio{

    @Autowired
    private IEditorialRepositorio editorialRepositorio;

    @Override
    public List<Editoriales> listaEditoriales() {
        List<Editoriales> editoriales;
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    @Override
    public Optional<Editoriales> obtenerEditorialesPorId(Integer id) {
        return editorialRepositorio.findById(id);
    }

    @Override
    public void guardarEditoriales(Editoriales editorial) {
        editorialRepositorio.save(editorial);
    }

    @Override
    public void eliminarEditoriales(Editoriales editorial) {
        editorialRepositorio.delete(editorial);
    }

}
