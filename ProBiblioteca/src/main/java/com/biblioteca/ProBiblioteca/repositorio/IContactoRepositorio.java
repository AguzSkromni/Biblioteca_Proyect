package com.biblioteca.ProBiblioteca.repositorio;

import com.biblioteca.ProBiblioteca.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepositorio extends JpaRepository<Contacto, Integer> {
}
