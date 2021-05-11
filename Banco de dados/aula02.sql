/*
   OPERADORES RELACIONAIS
   > Maior
   < Menor
   >= Maior ou igual
   <= Menor ou igual
   = IGUAL
   <> Diferente

   OPERADORES LÓGICOS

   E = AND
   OU = OR
*/
CREATE TABLE alunos(
   nome VARCHAR(30),
   nota1 FLOAT,
   nota2 FLOAT
);

INSERT INTO alunos VALUES
("Bruno", 7, 8.5),
("Carla", 9, 10),
("Ellen", 6, 8),
("Paula", 7, 5);

SELECT * FROM alunos;

SELECT nome, (nota1+nota2)/2 FROM alunos;

SELECT nome FROM alunos ORDER BY nome DESC;
/*
ORDER BY = Ordenação
  ASC = Menor/Maior ou A/Z
  DESC = Maior/Menor ou Z/A
*/

SELECT nome, IF((nota1+nota2)/2 >= 7,"Aprovado", "Reprovado") FROM alunos;

SELECT 
nome,
CONCAT (IF((nota1+nota2)/2 >= 7,"Aprovado", "Reprovado")," com média ", (nota1+nota2)/2) 
FROM alunos;

SELECT COUNT(*) FROM alunos;

SELECT MAX(nota1) FROM alunos;

SELECT MIN(nota1) FROM alunos;

SELECT AVG(nota1) FROM alunos;

SELECT nome, nota1 FROM alunos WHERE nota1 >= 7;
/*
  E% -> Inicia com o termo
  %A -> Finaliza com o termo
  %U%-> Contêm o termo
*/
SELECT nome FROM alunos WHERE nome LIKE"%U%";

UPDATE alunos SET nota2 = 7 WHERE nome = "Paula";

DELETE FROM alunos WHERE nome = "Carla";

DROP TABLE alunos;