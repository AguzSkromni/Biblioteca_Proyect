package com.biblioteca.ProBiblioteca.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.*;


@Entity
@Data
@Table(name = "editoriales")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_editorial")
    private Integer idEditorial;
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
}
