-- comentario SQL não faz diferença MAIÚSCULA e minuscula
-- para nomes compostos usa underline
-- drop table cliente;

-- marcar bd como padão 
use bd_itau;
-- criar BASE DE DADOS
create database bd_itau;
desc cliente; -- descreve  table cliente
drop table cliente;
create table cliente(
	codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(20),
    constraint pk_cliente primary key (codigo)
);

insert into cliente (codigo, nome, telefone) values (111, 'Carlos Augusto', '(11) 9999-9999');
insert into cliente (codigo, nome, telefone) values (112, 'Fernando Augusto', '(11) 9999-9992');
insert into cliente (codigo, nome, telefone) values (113, 'José Augusto', '(11) 9999-9993');
insert into cliente (codigo, nome, telefone) values (null, 'José Fernandes', '(11) 9999-9994');
select * from cliente;
select nome, telefone from cliente;

select nome, telefone from cliente where codigo =112;
delete from cliente where codigo =114;

-- atualizar dados 
update cliente set telefone = '(11) 9999-4999' where codigo =112;

create table veiculo (
	codigo integer not null auto_increment,
    marca varchar(20),
    proprietario integer, 
    constraint pk_veiculo primary key (codigo), 
    constraint fk_veiculo foreign key (proprietario) references cliente(codigo));

insert into cliente (codigo, marca, proprietario) values (111, 'Carlos Augusto', '(11) 9999-9999');

insert into veiculo values (null, 'BMW', 'X', 111);
select * from veiculo;