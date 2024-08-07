package com.biblioteca.ProBiblioteca.repositorio;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.ProBiblioteca.modelo.*;
import java.util.List;

public interface ILibroRepositorio extends JpaRepository<Libro, Integer>{
    List<Libro> findByCategoriaIdCategoria(Integer idCategoria);
}
