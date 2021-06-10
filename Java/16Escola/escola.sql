CREATE TABLE usuarios (    
  codigoUsuario INT AUTO_INCREMENT PRIMARY KEY,
  nomeUsuario VARCHAR(50),
  senhaUsuario VARCHAR(32),
  emailUsuario VARCHAR(40),
  bairroUsuario VARCHAR(30),
  ruaUsuario VARCHAR(40),
  numeroUsuario INT,
  complementoUsuario VARCHAR(100),
  telefoneUsuario VARCHAR(15),
  tipoUsuario INT
);

INSERT INTO usuarios VALUES
(null, "Admin", "123", "admin@apexensino.com.br", "Centro","Duque de Caxias", 20, null, "3322-3344", 1);

CREATE TABLE provas (             
  codigoProva INT AUTO_INCREMENT PRIMARY KEY,
  nomeProva VARCHAR(30),
  codigoProfessor INT,
  FOREIGN KEY(codigoProfessor) REFERENCES usuarios(codigoUsuario) 
);

CREATE TABLE turmas(
  codigoTurma INT AUTO_INCREMENT PRIMARY KEY,
  nomeTurma VARCHAR(30),
  turnoTurma VARCHAR(10),
  salaTurma INT 
);

CREATE TABLE alunos(
  codigoAluno INT,
  codigoTurma INT,
  FOREIGN KEY(codigoAluno) REFERENCES usuarios(codigoUsuario),
  FOREIGN KEY(codigoTurma) REFERENCES turmas(codigoTurma)
);

CREATE TABLE provasRealizadas(
  codigoAluno INT,
  codigoProva INT,
  notaAluno DOUBLE,
  FOREIGN KEY(codigoAluno) REFERENCES usuarios(codigoUsuario),
  FOREIGN KEY(codigoProva) REFERENCES provas(codigoProva)
);



