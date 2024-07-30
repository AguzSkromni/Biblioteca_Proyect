-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

-- Crear tabla Categoria
CREATE TABLE Categoria (
    idCategoria INT AUTO_INCREMENT PRIMARY KEY,
    Categoria VARCHAR(100) NOT NULL
);

-- Crear tabla Editoriales
CREATE TABLE Editoriales (
    idEditorial INT AUTO_INCREMENT PRIMARY KEY,
    Editorial VARCHAR(100) NOT NULL
);

-- Crear tabla Autores
CREATE TABLE Autores (
    idAutor INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL
);

-- Crear tabla Libro
CREATE TABLE Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    fechaLanzamiento DATE,
    Autor INT,
    Categoria INT,
    Idioma VARCHAR(50),
    Paginas INT,
    Descripcion TEXT,
    Portada VARCHAR(255),
    Editorial INT,
    FOREIGN KEY (Autor) REFERENCES Autores(idAutor),
    FOREIGN KEY (Categoria) REFERENCES Categoria(idCategoria),
    FOREIGN KEY (Editorial) REFERENCES Editoriales(idEditorial)
);