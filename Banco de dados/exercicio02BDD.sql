create table produtos(
	codigo int primary key auto_increment,
    nome varchar(20),
    marca varchar(20),
    valor double
);

insert into produtos (nome, marca, valor) values
("Galaxy S10", "Samsung", 5000),
("iPhone 11", "Apple", 6000),
("Moto G7", "Motorola", 1500),
("Galaxy Note 10", "Samsung", 6500),
("iPhone 8", "Apple", 3000),
("Iphone 11 Max", "Apple", 6500);

select * from produtos;

select marca from produtos group by marca;

select marca, count(*) from produtos group by marca;

select*from produtos where marca="Samsung" or marca="Apple";

select * from produtos where (marca="Samsung" or marca="Apple") and valor < 6000;

select * from produtos
where valor = (select max(valor) from produtos);

delete from produtos where marca = "samsung";

describe produtos;

insert into produtos values (null, "Galaxy A7", 2000, "Samsung");

insert into produtos values (null, "Galaxy A8",2350, "Samsung");

TRUNCATE TABLE produtos;
drop table produtos;


