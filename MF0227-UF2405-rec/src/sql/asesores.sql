drop database if exists seguros;
create database seguros  character set latin1 collate latin1_spanish_Ci;
USE seguros;

create table asesores (
	dni varchar(9) primary key,
    nombre varchar(20),
    apellidos varchar(30),
    tipo_contrato varchar(30),
    coche boolean,
    hogar boolean,
    decesos boolean,
    num_ventas smallint);

INSERT INTO asesores (dni,nombre,apellidos,tipo_contrato,coche,hogar,decesos,num_ventas) VALUES
	 ('10000000A','Ana','Gómez Martos','Autónomo',0,0,1,12),
	 ('2000000U','Marta','Peña León','Autónomo',0,1,0,8),
	 ('22222222S','María Jose','Sánchez López','Asalariado a comisión',0,1,0,15),
	 ('30000000A','Antonio','Cifuentes López','Asalariado fijo',1,0,0,15),
	 ('50000000R','Javier','González Martín','Asalariado a comisión',0,1,0,10);
