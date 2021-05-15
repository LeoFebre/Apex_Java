CREATE TABLE cargos(
codigo INT AUTO_INCREMENT PRIMARY KEY,
cargo VARCHAR(40) NOT NULL,
salario DOUBLE
);

CREATE TABLE filiais(
codigo INT AUTO_INCREMENT PRIMARY KEY,
estado VARCHAR(2),
cidade VARCHAR(30)
);

CREATE TABLE colaboradores(
codigo INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(70),
nascimento DATE,
cargo INT,
filial INT,
FOREIGN KEY(cargo) REFERENCES cargos(codigo),
FOREIGN KEY(filial) REFERENCES filiais(codigo)
);

INSERT INTO cargos (cargo, salario) VALUES
("Estagiário", 980),
("Desenvolvedor I", 1350),
("Desenvolvedor II", 1800),
("Desenvolvedor III", 2400),
("Analista I", 2680),
("Analista II", 3140),
("Analista III", 3900),
("Gerente de Projetos", 4700),
("Administrador de Banco de Dados I", 2500),
("Administrador de banco de Dados II", 3270),
("Administrador de banco de Dados III", 4100);

INSERT INTO filiais (estado, cidade) VALUES
("SC", "Blumenau"),
("SC", "Joinville"),
("SC", "Criciúma"),
("SC", "Florianópolis"),
("PR", "Curitiba"),
("PR", "Maringá"),
("SP", "São Paulo"),
("SP", "Campinas"),
("SP", "Franca"),
("MG", "Belo Horizonte"),
("GO", "Anápolis"),
("RJ", "Niterói");

INSERT INTO colaboradores (nome, nascimento, cargo, filial) VALUES
("Henrique Conceição", "2000/08/07", 1, 7),
("Jéssica Corrêa", "1991/07/25",  5, 1),
("Luana Muniz", "1990/06/19", 9, 6),
("Ricardo Alves", "1995/12/05", 11, 1),
("Mayara Sanchez", "1987/01/22", 8, 2),
("Daniel Starke", "1979/03/14", 6, 9),
("Eduardo Ruediger", "1981/04/27", 11, 4),
("Elizandra Ambrosi", "1994/02/06", 3, 1),
("Camila Fortal", "1992/11/07", 8, 7),
("Juliana Gonçalves", "1997/05/14", 1, 10),
("Caio Orbus", "1986/06/06", 4, 3),
("Cristiane Alcantra", "1981/10/07", 6, 4),
("Bianca da Cruz", "1990/12/08", 2, 1),
("Arnaldo Souza", "1984/01/08", 9, 5),
("Josué Azess", "1977/05/30", 8, 7),
("Renata de Paula", "1998/03/04", 1, 4); 

SELECT
cargos.cargo,
COUNT(colaboradores.nome)
FROM colaboradores
INNER JOIN cargos
ON colaboradores.cargo = cargos.codigo
GROUP BY colaboradores.cargo;

SELECT
filiais.estado,
COUNT(colaboradores.nome)
FROM colaboradores
INNER JOIN filiais
ON colaboradores.filial = filiais.codigo
GROUP BY filiais.estado;

SELECT nome, (2019-DATE_FORMAT(nascimento,"%Y")) AS idade FROM colaboradores WHERE nascimento = (SELECT MIN(nascimento) FROM colaboradores);

SELECT
cargos.cargo,
COUNT(colaboradores.cargo)
FROM colaboradores
INNER JOIN cargos
ON colaboradores.cargo = cargos.codigo
GROUP BY cargos.cargo;

SELECT
COUNT(colaboradores.nome)
FROM colaboradores
INNER JOIN filiais
ON colaboradores.filial = filiais.codigo
AND filiais.estado = "SC";

