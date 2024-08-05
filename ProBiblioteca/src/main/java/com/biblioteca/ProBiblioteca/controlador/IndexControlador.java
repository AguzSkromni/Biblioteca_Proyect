package com.biblioteca.ProBiblioteca.controlador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.biblioteca.ProBiblioteca.modelo.Libro;
import com.biblioteca.ProBiblioteca.servicio.ILibroServicio;

import org.springframework.ui.Model;


@Controller
public class IndexControlador {

    @Autowired
    private ILibroServicio libroServicio;

    public int contador = 0;

    @GetMapping("/")
    public String mostrarIndex(Model model) {

        List<Libro> librosTodos = libroServicio.listarLibros();
        //Recuperando el numero total de Libros
        int totalLibros = librosTodos.size();
        //variable Random
        Random random = new Random();
        //Genera un numero aleatorio entre el total de libros obtenidos
        Set<Integer> numerosAleatorios = new HashSet<>();

        //Crea 3 valores random en un SET,no permite que haya un valor igual
        while (numerosAleatorios.size() < 3) {
            int numeroAleatorios = random.nextInt(totalLibros) + 1;
            numerosAleatorios.add(numeroAleatorios);
        }

        //Pasamos el set a un Array para poderlo leer y manipular
        Integer[] numerosFinales = numerosAleatorios.toArray(new Integer[0]);
        //Creamos el List libroDestacados que se generara de manera Random
        List<Libro> librosDestacados = new ArrayList<>();

        // Pasamos los valores a List<>
        for(int i = 0; i < numerosFinales.length; i++){
            librosDestacados.add(libroServicio.obtenerLibroPorId(numerosFinales[i]).orElse(null));
        }

        //Mandando los libros a la vista
        model.addAttribute("libros", librosDestacados);
        

        return "index.xhtml";
    }


    @GetMapping("/autores")
    public String listarAutores() {
        return "autores.xhtml";
    }

    @GetMapping("/libros")
    public String listarLibros() {
        return "libros.xhtml";
    }

    @GetMapping("/editoriales")
    public String listarEditoriales() {
        return "editoriales.xhtml";
    }

    @GetMapping("/categorias")
    public String listarCategorias() {
        return "categorias.xhtml";
    }

}
