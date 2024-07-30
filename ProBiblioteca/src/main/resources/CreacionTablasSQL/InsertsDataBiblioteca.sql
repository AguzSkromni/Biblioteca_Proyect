-- Insertar datos en la tabla Categoria
INSERT INTO Categoria (Categoria) VALUES ('Ficción'), ('No Ficción'), ('Ciencia'), ('Historia'), ('Fantasía');

-- Insertar datos en la tabla Editoriales
INSERT INTO biblioteca.editoriales (biblioteca.editoriales.Editorial) VALUES ('Editorial Alfa'), ('Editorial Beta'), ('Editorial Gamma');

-- Insertar datos en la tabla Autores
INSERT INTO Autores (Nombre, Apellidos) VALUES
('Gabriel', 'García Márquez'),
('J.K.', 'Rowling'),
('Isaac', 'Asimov'),
('George', 'Orwell'),
('Jane', 'Austen');

-- Insertar datos en la tabla Libro
INSERT INTO Libro (titulo, fechaLanzamiento, Autor, Categoria, Idioma, Paginas, Descripcion, Portada, Editorial) VALUES
('Cien Años de Soledad', '1967-06-05', 1, 1, 'Español', 417, 'Una novela que narra la historia de la familia Buendía.', 'portada1.jpg', 1),
('El Amor en los Tiempos del Cólera', '1985-12-10', 1, 1, 'Español', 348, 'Una historia de amor épica.', 'portada2.jpg', 1),
('Crónica de una Muerte Anunciada', '1981-04-10', 1, 1, 'Español', 122, 'Un relato basado en un asesinato real.', 'portada3.jpg', 1),

('Harry Potter y la Piedra Filosofal', '1997-06-26', 2, 5, 'Inglés', 223, 'El primer libro de la saga de Harry Potter.', 'portada4.jpg', 2),
('Harry Potter y la Cámara Secreta', '1998-07-02', 2, 5, 'Inglés', 251, 'El segundo libro de la saga de Harry Potter.', 'portada5.jpg', 2),
('Harry Potter y el Prisionero de Azkaban', '1999-07-08', 2, 5, 'Inglés', 317, 'El tercer libro de la saga de Harry Potter.', 'portada6.jpg', 2),

('Fundación', '1951-06-01', 3, 3, 'Inglés', 244, 'La primera novela de la serie Fundación.', 'portada7.jpg', 3),
('Yo, Robot', '1950-12-02', 3, 3, 'Inglés', 253, 'Una colección de historias sobre robots.', 'portada8.jpg', 3),
('El Fin de la Eternidad', '1955-08-21', 3, 3, 'Inglés', 191, 'Una novela de ciencia ficción sobre viajes en el tiempo.', 'portada9.jpg', 3),

('1984', '1949-06-08', 4, 2, 'Inglés', 328, 'Una novela distópica.', 'portada10.jpg', 1),
('Rebelión en la Granja', '1945-08-17', 4, 2, 'Inglés', 112, 'Una alegoría de la revolución rusa.', 'portada11.jpg', 1),
('Homenaje a Cataluña', '1938-04-25', 4, 2, 'Inglés', 232, 'Una memoria de la guerra civil española.', 'portada12.jpg', 1),

('Orgullo y Prejuicio', '1813-01-28', 5, 1, 'Inglés', 432, 'Una novela romántica.', 'portada13.jpg', 2),
('Sentido y Sensibilidad', '1811-10-30', 5, 1, 'Inglés', 368, 'Una novela sobre las hermanas Dashwood.', 'portada14.jpg', 2),
('Emma', '1815-12-23', 5, 1, 'Inglés', 474, 'Una novela sobre los problemas de la juventud y el matrimonio.', 'portada15.jpg', 2);