CREATE TABLE uzuarios(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20),
    sobrenome VARCHAR(50),
    idade INT
);
    ALTER TABLE uzuarios RENAME TO usuarios;

    ALTER TABLE usuarios ADD COLUMN email VARCHAR(40);

    INSERT INTO usuarios VALUES
(null, "Vanessa", 16, "vanessa.rosa@gmail.com"),
(null, "Adailton",22,"adailton.maas@yahoo.com.br"),
(null,"Andressa",36,"dessa.simas@uol.com.br"),
(null,"Mayra",24,"mayra.antunes@gmail.com"),
(null,"Cristiane",14,"criss.maya@gmail.com"),
(null,"Leonardo",15,"leo.kopff@terra.com.br"),
(null,"Carina",27,"carina.almeida@gmail.com"),
(null,"Clóvis",29,"clovis.simao@hotmail.com"),
(null,"Gabriela",23,"gabriela.braga@live.com"),
(null,"Cibele",null,"cibele.lins@uol.com.br");

SELECT * FROM usuarios;

SELECT * FROM usuarios WHERE idade < 18;

select*from usuarios where email like "%gmail%";

SELECT * FROM usuarios WHERE idade = (SELECT MAX(idade) FROM usuarios);

SELECT * FROM usuarios WHERE idade IS NULL;

UPDATE usuarios SET idade = 27 WHERE idade IS NULL;

DELETE FROM usuarios WHERE idade < 18;

TRUNCATE TABLE usuarios;

DROP TABLE usuarios;
