package com.biblioteca.ProBiblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.ProBiblioteca.modelo.*;;

public interface IEditorialRepositorio extends JpaRepository<Editoriales, Integer>{
    //Dejamos vacio, no requerimos metodos de consulta personalizado por el momento

}
