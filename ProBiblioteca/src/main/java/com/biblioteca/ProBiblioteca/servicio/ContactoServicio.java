package com.biblioteca.ProBiblioteca.servicio;

import com.biblioteca.ProBiblioteca.modelo.Contacto;
import com.biblioteca.ProBiblioteca.repositorio.IContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoServicio implements IContactoServicio{
    @Autowired
    private IContactoRepositorio contactoRepositorio;

    @Override
    public List<Contacto> listarContactos() {
        List<Contacto> contactoTodos = contactoRepositorio.findAll();
        return contactoTodos;
    }

    @Override
    public Optional<Contacto> obtenerContactoPorId(Integer id) {
        return contactoRepositorio.findById(id);
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoRepositorio.save(contacto);
    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        contactoRepositorio.delete(contacto);
    }
}
