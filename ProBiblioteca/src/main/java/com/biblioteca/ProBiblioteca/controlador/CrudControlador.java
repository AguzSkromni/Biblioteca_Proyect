package com.biblioteca.ProBiblioteca.controlador;

import com.biblioteca.ProBiblioteca.modelo.Item;
import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@ViewScoped
@RequestMapping("/crud")
public class CrudControlador {

    private List<Item> items; // Suponiendo que tienes una clase Item
    private Item newItem; // Propiedad para el nuevo ítem
    private Item selectedItem; // Propiedad para el ítem seleccionado

    @PostConstruct
    public void init() {
        items = new ArrayList<>(); // Inicializa la lista de ítems
        if (!isUserLoggedIn()) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/login");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isUserLoggedIn() {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") != null;
    }

    public List<Item> getItems() {
        return items;
    }

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    // Métodos para manejar las operaciones CRUD
    public void create() {
        // Lógica para crear un nuevo ítem
        items.add(newItem);
        newItem = new Item(); // Reiniciar el ítem nuevo
    }

    public void edit(Item item) {
        selectedItem = item; // Establecer el ítem seleccionado
    }

    public void update() {
        // Lógica para actualizar el ítem seleccionado
        // Implementa la lógica para actualizar el ítem
        selectedItem = null; // Reiniciar el ítem seleccionado
    }

    public void delete(Item item) {
        items.remove(item); // Lógica para eliminar un ítem
    }
}