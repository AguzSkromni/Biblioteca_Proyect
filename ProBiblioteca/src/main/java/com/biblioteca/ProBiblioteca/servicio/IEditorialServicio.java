package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import com.biblioteca.ProBiblioteca.modelo.*;

public interface IEditorialServicio {

    public List<Editorial> listaEditoriales();

    public Optional<Editorial> obtenerEditorialesPorId(Integer id);

    public void guardarEditoriales(Editorial editorial);

    public void eliminarEditoriales(Editorial editorial);
}
