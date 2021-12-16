# aulas-git-gama

## Aula 2

- Criar Branchs Feature e Hotfux
- Merge com a master
- Criar repositorio online
- Enviar alterações do local o online
- Criar README.md online enviar para o local

## Aula 10

- Instalar MySQL;

### - **OBSERVAÇÕES**

- comentário --
- terminar linha usar ";"
- comentario SQL não faz diferença MAIÚSCULA e minuscula. EX: COMBINAR COM O TIME insert ou INSERT
- para nomes compostos usa underline EX: cadastro_cliente

### - **COMANDOS**

1. use bd_itau;

- marcar bd como padão

2. create database bd_itau;

- criar BASE DE DADOS

3. create table cliente(
   codigo integer not null auto_increment,
   nome varchar(120) not null,
   telefone varchar(20),
   constraint pk_cliente primary key (codigo)
   );

- criar tabela

4. desc cliente;

- descreve table cliente

5. insert into cliente (codigo, nome, telefone) values (111, 'Carlos Augusto', '(11) 9999-9999');
   ou
   insert into cliente values (111, 'Carlos Augusto', '(11) 9999-9999');
   ou
   (111, 'Carlos Augusto', '(11) 9999-9999'), (111, 'Carlos Augusto', '(11) 9999-9999'),
   (111, 'Carlos Augusto', '(11) 9999-9999');

- inserir dados na tabela

6. select \* from cliente;
   select nome, telefone from cliente;
   select nome, telefone from cliente where codigo =114;

- selecionar TODOS from cliente

7. delete from cliente where codigo =114;

8. relacionamento de tabelas

- chaves
- cardinalidade quantidade que acontece entre as 2. em um depto tem varios funcionario 1:N a chave só funciona
  um empregado trabalha em quantos dpta
- fk sempre com pk não coluna
- inner join

## Aula 11

- Instalar Spring Boot Tools;

## EXERCÍCIOS JAVA BEECROWD

- [x] BEE1003
- [x] BEE1004
- [x] BEE1006
- [x] BEE1035
- [x] BEE1037
- [x] BEE1048
- [x] BEE1059
- [x] BEE1064
- [x] BEE1114
- [x] BEE1117
