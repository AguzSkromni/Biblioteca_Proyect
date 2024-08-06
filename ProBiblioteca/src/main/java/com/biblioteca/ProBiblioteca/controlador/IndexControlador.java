package com.biblioteca.ProBiblioteca.controlador;

import java.util.*;

import com.biblioteca.ProBiblioteca.modelo.Autor;
import com.biblioteca.ProBiblioteca.modelo.Categoria;
import com.biblioteca.ProBiblioteca.modelo.Editorial;
import com.biblioteca.ProBiblioteca.servicio.IAutorServicio;
import com.biblioteca.ProBiblioteca.servicio.ICategoriaServicio;
import com.biblioteca.ProBiblioteca.servicio.IEditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;

import com.biblioteca.ProBiblioteca.modelo.Libro;
import com.biblioteca.ProBiblioteca.servicio.ILibroServicio;

import org.springframework.ui.Model;


@Controller
public class IndexControlador {

    @Autowired
    private ILibroServicio libroServicio;
    @Autowired
    private IAutorServicio autorServicio;
    @Autowired
    private IEditorialServicio editorialServicio;
    @Autowired
    private ICategoriaServicio categoriaServicio;

    @GetMapping("/")
    public String mostrarIndex(Model model) {
        randomLibroIndex(model);
        categoriaIndex(model);
        autoresDestacados(model);

        return "index.xhtml"; // Retorna el nombre de la vista
    }

    @GetMapping("/autores")
    public String listarAutores(Model model) {
        // Obtén la lista de autores
        List<Autor> listadoAutores = autorServicio.listarAutores();
        // Añade la lista al modelo
        model.addAttribute("autores", listadoAutores);
        return "autores.xhtml";

    }

    @GetMapping("/libros")
    public String listarLibros(Model model) {
        List<Libro> listadoLibros = libroServicio.listarLibros();

        Collections.shuffle(listadoLibros);

        for (Libro libro : listadoLibros) {
            System.out.println(libro);
        }

        model.addAttribute("libros", listadoLibros);
        return "libros.xhtml";
    }

    @GetMapping("/editoriales")
    public String listarEditoriales(Model model) {
        List<Editorial> editorialList = editorialServicio.listaEditoriales();
        model.addAttribute("editoriales", editorialList);
        return "editoriales.xhtml";
    }

    @GetMapping("/categorias")
    public String listarCategorias(Model model) {
        List<Categoria> categoriaList = categoriaServicio.listaCategorias();
        model.addAttribute("categorias", categoriaList);
        return "categorias.xhtml";
    }

    /* METODOS INDEX */
    public String randomLibroIndex(Model model){
        List<Libro> librosTodos = libroServicio.listarLibros();
        // Recuperando el numero total de Libros
        int totalLibros = librosTodos.size();
        // variable Random
        Random random = new Random();
        // Genera un numero aleatorio entre el total de libros obtenidos
        Set<Integer> numerosAleatorios = new HashSet<>();

        // Crea 3 valores random en un SET, no permite que haya un valor igual
        while (numerosAleatorios.size() < 3) {
            int numeroAleatorios = random.nextInt(totalLibros);
            if(numeroAleatorios != 0) {
                numerosAleatorios.add(numeroAleatorios);
            }
        }

        // Pasamos el set a un Array para poderlo leer y manipular
        Integer[] numerosFinales = numerosAleatorios.toArray(new Integer[0]);
        // Creamos el List libroDestacados que se generara de manera Random
        List<Libro> librosDestacados = new ArrayList<>();

        // Pasamos los valores a List<>
        for (int i = 0; i < numerosFinales.length; i++) {
            librosDestacados.add(libroServicio.obtenerLibroPorId(numerosFinales[i]).orElse(null));
        }

        // Mandando los libros a la vista
        model.addAttribute("libros", librosDestacados);
        return model.toString();
    }

    public String categoriaIndex(Model model){
        List<Categoria> categoriaTodos = categoriaServicio.listaCategorias();
        // Recuperando el numero total de categorias
        int totalCategorias = categoriaTodos.size();
        // variable Random
        Random random = new Random();
        // Genera un numero aleatorio entre el total de categorias obtenidos
        Set<Integer> numerosAleatorios = new HashSet<>();

        // Crea 3 valores random en un SET, no permite que haya un valor igual
        while (numerosAleatorios.size() < 5) {
            int numeroAleatorios = random.nextInt(totalCategorias);
            if(numeroAleatorios != 0){
                numerosAleatorios.add(numeroAleatorios);
            }
        }

        // Pasamos el set a un Array para poderlo leer y manipular
        Integer[] numerosFinales = numerosAleatorios.toArray(new Integer[0]);
        // Creamos el List categoriaRandom que se generara de manera Random
        List<Categoria> categoriaRandom = new ArrayList<>();

        // Pasamos los valores a List<>
        for (int i = 0; i < numerosFinales.length; i++) {
            categoriaRandom.add(categoriaServicio.obtenerCategoriaPorId(numerosFinales[i]).orElse(null));
        }

        // Mandando los libros a la vista
        model.addAttribute("categorias", categoriaRandom);
        return model.toString();
    }

    public String autoresDestacados(Model model){
        List<Autor> autoresTodos = autorServicio.listarAutores();
        // Recuperando el numero total de categorias
        int totalAutores = autoresTodos.size();
        // variable Random
        Random random = new Random();
        // Genera un numero aleatorio entre el total de categorias obtenidos
        Set<Integer> numerosAleatorios = new HashSet<>();

        // Crea 3 valores random en un SET, no permite que haya un valor igual
        while (numerosAleatorios.size() < 3) {
            int numeroAleatorios = random.nextInt(totalAutores);
            if(numeroAleatorios != 0){
                numerosAleatorios.add(numeroAleatorios);
            }

        }

        // Pasamos el set a un Array para poderlo leer y manipular
        Integer[] numerosFinales = numerosAleatorios.toArray(new Integer[0]);
        // Creamos el List categoriaRandom que se generara de manera Random
        List<Autor> autoresRandom = new ArrayList<>();

        // Pasamos los valores a List<>
        for (int i = 0; i < numerosFinales.length; i++) {
            autoresRandom.add(autorServicio.obtenerAutorPorId(numerosFinales[i]).orElse(null));
        }

        // Mandando los libros a la vista
        model.addAttribute("autores", autoresRandom);

        return model.toString();
    }
}
