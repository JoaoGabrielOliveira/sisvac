# criar a tabela paciente
CREATE TABLE tb_paciente(
ID INT PRIMARY KEY AUTO_INCREMENT,
NOME VARCHAR (120),
DT_NASCIMENTO DATE,
E_SAUDE BOOLEAN,
vacinado BOOLEAN
);

#criando a tabela funcionario
CREATE TABLE tb_funcionario(
ID INT PRIMARY KEY AUTO_INCREMENT,
NOME VARCHAR (120),
DT_NASCIMENTO DATE,
CARGO VARCHAR (120),
EMAIL VARCHAR (120)
);

#criando a tabela vacina 
CREATE TABLE tb_vacina(
ID_LOTE INT PRIMARY KEY AUTO_INCREMENT,
QUANTIDADE INT ,
DATA_ENTRADA DATE,
FABRICANTE VARCHAR (120)
);

# criando a tabela unidade de saude
CREATE TABLE tb_unidade_saude (
id_unidade_saude INT PRIMARY KEY AUTO_INCREMENT,
CEP INT (08),
NOME VARCHAR (120)
);

SELECT * FROM tb_vacina;
SELECT * FROM tb_funcionario;
	SELECT * FROM tb_paciente;
SELECT * FROM tb_unidade_saude;
INSERT INTO tb_unidade_saude(cep,nome) VALUES (00000000,"Desenvolvimento");

SELECT * FROM tb_endereco;

#adicionar a FK a tabela vacina
ALTER TABLE tb_vacina ADD COLUMN ID_UNIDADE_SAUDE INT,
ADD CONSTRAINT FK_UNIDADE_SAUDE
FOREIGN KEY (ID_UNIDADE_SAUDE)
REFERENCES tb_unidade_saude (ID_UNIDADE_SAUDE);

#adicionar a FK a tabela funcionario
ALTER TABLE tb_funcionario ADD COLUMN ID_UNIDADE_SAUDE INT,
ADD CONSTRAINT FK_UBS
FOREIGN KEY (ID_UNIDADE_SAUDE)
REFERENCES tb_unidade_saude (ID_UNIDADE_SAUDE);

# criando a tabela endereço
CREATE TABLE tb_endereco (
RUA VARCHAR(80),
NUMERO INT(10),
CIDADE VARCHAR(80),
UF CHAR(02),
PAIS VARCHAR(30)
);

#adicionando a FK na tabela endereço
ALTER TABLE tb_endereco ADD COLUMN ID_ENDERECO INT,
ADD CONSTRAINT FK_ID_ENDERECO
FOREIGN KEY (ID_ENDERECO)
REFERENCES tb_paciente (ID);

ALTER TABLE tb_endereco ADD COLUMN ID INT PRIMARY KEY AUTO_INCREMENT;


ALTER TABLE `db_sisvac`.`tb_endereco` 
ADD INDEX `ID_UNIDADE_SAUDE_idx` (`ID_UNIDADE_SAUDE` ASC) VISIBLE;
;
ALTER TABLE `db_sisvac`.`tb_endereco` 
ADD CONSTRAINT `ID_UNIDADE_SAUDE`
  FOREIGN KEY (`ID_UNIDADE_SAUDE`)
  REFERENCES `db_sisvac`.`tb_unidade_saude` (`ID_UNIDADE_SAUDE`);


ALTER TABLE `db_sisvac`.`tb_endereco` 
ADD CONSTRAINT `ID_ENDERECO`
  FOREIGN KEY (`ID_ENDERECO`)
  REFERENCES `db_sisvac`.`tb_paciente` (`ID`);


ALTER TABLE tb_funcionario ADD COLUMN SENHA VARCHAR (80);

# Criar a tabela vacinado
CREATE TABLE tb_vacinado(
	ID INT PRIMARY KEY AUTO_INCREMENT,
	id_paciente INT,
	id_unidade_saude INT,
	data_vacinacao DATE
);

ALTER TABLE tb_vacinado
ADD CONSTRAINT FK_id_paciente
FOREIGN KEY (id_paciente)
REFERENCES tb_paciente(id);

ALTER TABLE tb_vacinado
ADD CONSTRAINT FK_id_unidade_saude
FOREIGN KEY (id_unidade_saude)
REFERENCES tb_unidade_saude(id_unidade_saude);


ALTER TABLE tb_paciente
ALTER vacinado SET DEFAULT false;

