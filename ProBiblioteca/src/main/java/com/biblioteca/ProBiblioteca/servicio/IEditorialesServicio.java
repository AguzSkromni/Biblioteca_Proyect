package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import com.biblioteca.ProBiblioteca.modelo.Editoriales;

public interface IEditorialesServicio {

    public List<Editoriales> listaEditoriales();

    public Optional<Editoriales> obtenerEditorialesPorId(Integer id);

    public void guardarEditoriales(Editoriales editorial);

    public void eliminarEditoriales(Editoriales editorial);
}
