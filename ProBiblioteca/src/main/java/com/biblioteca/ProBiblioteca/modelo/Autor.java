package com.biblioteca.ProBiblioteca.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "autores")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Integer idAutor;
    
    private String nombre;
    private String apellidos;
}
