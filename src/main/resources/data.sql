DROP table IF EXISTS pelicula;
DROP table IF EXISTS sala;

create table sala(
    codigo int auto_increment primary key,
    nombre varchar(250));

create table pelicula(
	codigo int auto_increment primary key,
    nombre varchar(250),
    calificacion_edad int,
    codigo_sala int,
	foreign key (codigo_sala) references sala(codigo) on delete cascade on update cascade);

insert into sala (nombre)values('sala 1');
insert into sala (nombre)values('sala 2');
insert into sala (nombre)values('sala 3');
insert into sala (nombre)values('sala 4');
insert into sala (nombre)values('sala 5');

insert into pelicula (nombre, calificacion_edad, codigo_sala) values ('pelicula 1', 13, 1);
insert into pelicula (nombre, calificacion_edad, codigo_sala) values ('pelicula 2', 18, 1);
insert into pelicula (nombre, calificacion_edad, codigo_sala) values ('pelicula 3', 16, 2);
insert into pelicula (nombre, calificacion_edad, codigo_sala) values ('pelicula 4', 3, 3);
insert into pelicula (nombre, calificacion_edad, codigo_sala) values ('pelicula 5', 7, 4);
insert into pelicula (nombre, calificacion_edad, codigo_sala) values ('pelicula 6', 5, 5);
