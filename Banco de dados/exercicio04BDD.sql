CREATE TABLE produtos(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	produto VARCHAR(40),
	categoria VARCHAR(20),
	valor DOUBLE,
	cadastro DATE
);

INSERT INTO produtos VALUES
(null,"Smartphone Samsung A8","telefonia", 1400.00 , '2019-07-22'),
(null, "Notebook Acer A650","informática",'3800.00' ,  '2019-03-19'),
(null, "Telefone sem fio Intelbras","telefonia",'129.90', '2018-12-20'),
(null, "iPhone XR","telefonia", '5499.00', '2019-07-08'),
(null, "Notebook Dell Espiron 500","informática",'3975.80', '2019-01-29'),
(null, "All in one LG A8574","informática",'2547.12', '2019-02-13'),
(null, "Smartphone Motorola G7","telefonia",'799.00', '2019-04-03'),
(null, "Smartphone Galaxy S10","telefonia",'4600.00', '2019-05-03'),
(null, "Notebook Acer Axpros 47","informática",'2857.00', '2019-08-16'),
(null, "Smartphone Asus Zenfone 6","telefonia",'2356.00', '2018-07-29'),
(null, "Smartphone Samsung J4", null, '1700.00', '2018-06-16');

SELECT COUNT(*) FROM produtos;

select*from produtos;

select*from produtos where cadastro BETWEEN "2019-04-01" and "2019-07-31";

update produtos set categoria="telefonia" where categoria is null;

select categoria, count(categoria) from produtos group by categoria;

SELECT ROUND(avg (valor),2) from produtos; 

select*from produtos where valor = (select min(valor)from produtos);

select*from produtos where valor >= 4000;

SELECT * FROM produtos WHERE DATE_FORMAT(cadastro, "%Y") = 2018;

DELETE FROM produtos WHERE produto LIKE '%Samsung%' OR produto LIKE '%LG%';

SELECT codigo FROM produtos WHERE produto LIKE '%Intelbras%';

DROP TABLE produtos;