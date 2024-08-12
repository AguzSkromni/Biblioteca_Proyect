package com.biblioteca.ProBiblioteca.controlador;

import com.biblioteca.ProBiblioteca.modelo.Contacto;
import com.biblioteca.ProBiblioteca.servicio.ContactoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/contacto")
public class ContactoControlador {

    @Autowired
    private ContactoServicio contactoServicio;

    @GetMapping
    public String mostrarFormulario() {
        return "contact.xhtml";
    }

    //pasamos varios parametros que son request
    @PostMapping
    public String enviarFormulario(
            @RequestParam("name") String nombre,
            @RequestParam("email") String email,
            @RequestParam("subject") String asunto,
            @RequestParam("message") String mensaje,
            @RequestParam(value = "agree", required = false) Boolean aceptoTerminos,
            Model model) {

//        if (aceptoTerminos == null || !aceptoTerminos) {
//            model.addAttribute("error", "You must agree to the terms and conditions before submitting.");
//            return "contact.xhtml";
//        }

        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        contacto.setEmail(email);
        contacto.setAsunto(asunto);
        contacto.setMensaje(mensaje);

        contacto.setAceptoTerminos(aceptoTerminos);

        contactoServicio.guardarContacto(contacto);

        model.addAttribute("success", "Your message has been sent successfully!");

        return "successEmail.xhtml";
    }
}
