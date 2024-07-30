package com.biblioteca.ProBiblioteca.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControlador {
    @GetMapping("/")
    public String mostrarIndex() {
        return "index.xhtml"; // Asegúrate de que retorna el nombre correcto del archivo
    }

    @GetMapping("/autores")
    public String listarAutores() {
        return "autores.xhtml"; // Asegúrate de que retorna el nombre correcto del archivo
    }

    @GetMapping("/libros")
    public String listarLibros() {
        return "libros.xhtml"; // Asegúrate de que retorna el nombre correcto del archivo
    }

    @GetMapping("/editoriales")
    public String listarEditoriales() {
        return "editoriales.xhtml"; // Asegúrate de que retorna el nombre correcto del archivo
    }

    @GetMapping("/categorias")
    public String listarCategorias() {
        return "categorias.xhtml"; // Asegúrate de que retorna el nombre correcto del archivo
    }
}
