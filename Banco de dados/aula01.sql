create table usuarios(
   nome VARCHAR(20),
   idade INT
);

DESCRIBE usuarios;

ALTER TABLE usuarios ADD cidade VARCHAR(30);

ALTER TABLE usuarios DROP COLUMN cidade;

INSERT INTO usuarios VALUES("Leonardo" , 28);

INSERT INTO usuarios (nome) VALUES ("Amanda");

SELECT * FROM usuarios;

DROP TABLE usuarios;