package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import com.biblioteca.ProBiblioteca.modelo.Categoria;

public interface ICategoriaServicio {

    public List<Categoria> listaCategorias();

    public Optional<Categoria> obtenerCategoriaPorId(Integer id);

    public void guardarCategoria(Categoria categoria);

    public void eliminarCategoria(Categoria categoria);

}
