package com.biblioteca.ProBiblioteca.servicio;

import com.biblioteca.ProBiblioteca.modelo.Contacto;

import java.util.List;
import java.util.Optional;

public interface IContactoServicio {

    public List<Contacto> listarContactos();

    public Optional<Contacto> obtenerContactoPorId(Integer id);

    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);
}
