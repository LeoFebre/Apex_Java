CREATE TABLE autores (
  idAutor INT AUTO_INCREMENT PRIMARY KEY,
  nomeAutor VARCHAR(50)
);

CREATE TABLE generos (
  idGenero INT AUTO_INCREMENT PRIMARY KEY,
  nomeGenero VARCHAR(30)
);

CREATE TABLE livros (
idLivro AUTO_INCREMENT PRIMARY KEY,
nomeLivro VARCHAR(30),
idAutor INT,
idGenero INT,
FOREIGN KEY (idAutor) REFERENCES autores(idAutor),
FOREIGN KEY (idGenero) REFERENCES generos(idGenero)
);

INSERT INTO autores VALUES
(null,"Stephen King"),
(null,"Scott Snyder"),
(null,"Georges Prosper Remi-Hergé");

INSERT INTO generos VALUES
(null,"Terror"),
(null,"HQ"),
(null,"Fantasia"),
(null,"Aventura"),
(null,"Mistério");

INSERT INTO livros(nomeLivro,idAutor,idGenero) VALUES
("As Aventuras de Tintin", "Georges Prosper Remi-Hergé", "HQ,Fantasia,Aventura,Mistério"),
("Vampiro Americano", "Scott Snyder", "HQ,Fantasia,Terror,Aventura,Mistério"),
("O iluminado", "Stephen King", "Terror,Fantasia,Mistério"),
("Batman", "Scott Snyder", "HQ,Fantasia,Aventura,Mistério");










