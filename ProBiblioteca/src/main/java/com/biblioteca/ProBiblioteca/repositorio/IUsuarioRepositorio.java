package com.biblioteca.ProBiblioteca.repositorio;

import com.biblioteca.ProBiblioteca.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    Usuario findByUsername(String username);
}