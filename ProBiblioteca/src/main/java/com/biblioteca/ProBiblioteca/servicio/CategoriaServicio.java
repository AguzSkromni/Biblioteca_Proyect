package com.biblioteca.ProBiblioteca.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.ProBiblioteca.modelo.Categoria;
import com.biblioteca.ProBiblioteca.repositorio.ICategoriaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio implements ICategoriaServicio{

    @Autowired
    private ICategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> listaCategorias() {
        List<Categoria> categorias;
        categorias = categoriaRepositorio.findAll();
        return categorias;
    }

    @Override
    public Optional<Categoria> obtenerCategoriaPorId(Integer id) {
        return categoriaRepositorio.findById(id);
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepositorio.save(categoria);
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
        categoriaRepositorio.delete(categoria);
    }

}
