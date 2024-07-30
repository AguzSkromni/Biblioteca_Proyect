package com.biblioteca.ProBiblioteca.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;
    private String nombre;
    private String Apellidos;

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setIdAutor(1);
        autor.setNombre("Nombre");
        autor.setApellidos("Apellidos");

        System.out.println(autor);
    }
}
