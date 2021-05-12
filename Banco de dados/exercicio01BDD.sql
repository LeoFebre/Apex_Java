create table alunos(
	nome varchar(30),
    idade int,
    nota1 double,
    nota2 double
);
DESCRIBE usuarios;

insert into alunos values
("Ana", 15, 7.5, 8.2),
("Lucas",null, 9, 8.6),
("Vanessa", 16, 6.6, 7.1),
("Leonardo", 15, 5, 4.5),
("Dênis", 17, 10, 10);

select * from alunos;

SELECT nome, (nota1+nota2)/2 FROM alunos;

select 
	nome, 
    round((nota1+nota2)/2, 1) as "média", 
    if((nota1+nota2)/2 >= 7, "Aprovado", "Reprovado") as "situação"
from alunos;

SELECT * FROM alunos WHERE idade < 16;

SELECT * FROM alunos WHERE idade IS NUll;

select * from alunos ORDER BY nome DESC;

select nome from alunos where nome like "%L%";

select nome from alunos where nome like "a%";

select nome from alunos where nome like "%a";

select count(*) from alunos;

select sum(idade) from alunos;

select max(idade) from alunos;

select min(idade) from alunos;

update alunos set idade = 15 where idade is null;

delete from alunos where idade > 15;

drop table alunos;