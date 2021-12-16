create database bd_itau_aula;

insert into cliente (cod, nome, email) values (null, 'Ana Sousa', 'ana@ana.com');
insert into cliente (cod, nome, email) values (null, 'Bianca Sousa', 'bianca@bianca.com');
insert into cliente (cod, nome, email) values (null, 'Carla Sousa', 'carla@carla.com');
select * from cliente;


use bd_itau_aula;
insert into veiculo  values (null, 'X1', 2010, 6);
insert into veiculo  values (null, 'V210', 2015, 7);
insert into veiculo  values (null, 'A200', 2020, 8);


select * from veiculo;

-- drop table cliente;