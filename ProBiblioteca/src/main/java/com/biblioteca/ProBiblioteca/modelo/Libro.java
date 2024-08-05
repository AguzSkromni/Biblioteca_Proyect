package com.biblioteca.ProBiblioteca.modelo;

import java.time.LocalDate;

import lombok.*;

import jakarta.persistence.*;


@Entity
@Data
@Table(name = "libros")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    private String titulo;
    private LocalDate fechaLanzamiento;
    private String portada;
    private String idioma;
    private Integer paginas;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_autor", referencedColumnName = "id_autor", nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_editorial", referencedColumnName = "id_editorial")
    private Editorial editorial;
}
