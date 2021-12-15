create database bd_itau_aula;

insert into cliente (cod, nome, email) values (null, 'Ana Sousa', 'ana@ana.com');
insert into cliente (cod, nome, email) values (null, 'Bianca Sousa', 'bianca@bianca.com');
insert into cliente (cod, nome, email) values (null, 'Carla Sousa', 'carla@carla.com');


select * from cliente;

drop table cliente;