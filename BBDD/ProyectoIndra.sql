drop database if exists proyecto;
create database proyecto;
use proyecto;

create table organizador(
idOrganizador int unsigned primary key auto_increment,
nombre varchar(25) not null,
tipoOrganizador enum('empresa','institución','independiente')
);
#IMPORTANTE
#Añadir tipo de organizador enum en el diagrama

#Solo se pone el nombre y tipoOrganizador id es auto_increment
INSERT INTO organizador (nombre, tipoOrganizador) VALUES 
('Tech Corp', 'empresa'),
('Universidad Central', 'institución'),
('koda', 'independiente');

create table tipos(
idTipos int unsigned primary key auto_increment,
nombre varchar(50) not null
);

INSERT INTO tipos (nombre) VALUES
('Conferencia'),
('Taller'),
('Seminario');

create table evento(
idEvento int unsigned primary key auto_increment,
nombre varchar(25) not null,
fecha date not null,
duracion int not null,
ubicacion varchar(50) not null,
idTipo int unsigned not null,
idOrganizador int unsigned null,
foreign key (idTipo) references tipos(idTipos) on delete cascade on update cascade ,
foreign key (idOrganizador) references organizador(idOrganizador)
);

INSERT INTO evento (nombre, fecha, duracion, ubicacion, idTipo, idOrganizador) VALUES
('Tecnología', '2025-02-28', 3, 'plaza pilar', 1, 1),
('Programación', '2025-02-28', 2, 'plaza pilar', 2, 2),
('Sostenibilidad', '2025-02-28', 4, 'plaza pilar', 3, 1),
('Ciberseguridad', '2025-02-28', 3, 'plaza pilar', 1, NULL);

create table usuarios(
idUsuarios int unsigned primary key auto_increment,
nombre varchar(25) not null,
correo varchar(50) not null,
contraseña varchar(50) not null
);

INSERT INTO usuarios (nombre, correo, contraseña) VALUES
('rodrigo muni', 'rodrigo@mail.com', 'contra123'),
('diego sánchez', 'diego@mail.com', 'contra456'),
('alvaro romo', 'alvaro@mail.com', 'contra789');

create table inscripciones(
idInscripciones int unsigned primary key auto_increment,
idUsuarios int unsigned not null,
idEvento int unsigned not null,
foreign key (idUsuarios) references usuarios(idUsuarios) on delete cascade on update cascade,
foreign key (idEvento) references evento(idEvento) on delete cascade on update cascade
);

INSERT INTO inscripciones (idUsuarios, idEvento) VALUES
(1, 1),  #Carlos López se inscribe en "Innovación Tecnológica"
(2, 2),  #María González se inscribe en "Taller de Programación"
(1, 3),  #Carlos López se inscribe en "Sostenibilidad en Empresas"
(3, 1);  #Pedro Sánchez se inscribe en "Innovación Tecnológica"

create table contactos(
idContactos int unsigned primary key auto_increment,
idOrganizador int unsigned not null,
tipoContacto enum('teléfono','correo') not null,
valor varchar(25) not null,
foreign key (idOrganizador) references organizador(idOrganizador) on delete cascade on update cascade
);

INSERT INTO contactos (idOrganizador, tipoContacto, valor) VALUES
(1, 'teléfono', '1234'),
(1, 'correo', 'contacto@gmail.com'),
(2, 'teléfono', '5678'),
(3, 'correo', 'contacto2@gmail.com');

#IMPORTANTE!!!!
#Cambiar tipoContacto en el diagrama de varchar a enum


#Cuantos usuarios se han inscrito a cada evento
SELECT usuarios.nombre FROM usuarios, inscripciones WHERE usuarios.idUsuarios = inscripciones.idUsuarios AND inscripciones.idEvento = 2; 
#Esto te permite ver los usuarios que se han registrado aun evento especifico











