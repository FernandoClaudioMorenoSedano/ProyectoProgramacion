use proyectoprogramacion;

create table Entrenador(
	nombre varchar(30) primary key,
    numeroDeEquipos int(2)
);

create table Equipo(
	nombre varchar(30) primary key,
    nombreEntrenador varchar(30) references Entrenador(nombre),
    raza varchar(30),
    nombreEstadio varchar(30)
);

create table Jugador(
	nombre varchar(30) primary key,
    nombreEquipo varchar(30) references Equipo(nombre),
    movimiento int(2),
    fuerza int(2),
    agilidad int(2),
    armadura int(2),
    numMaxPorEquipo int(2)
);


create table Partido(
	equipoLocal varchar(30) references Equipo(nombre),
    equipoVisitante varchar(30) references Equipo(nombre),
    numTouchdownEquipoLocal int(2),
    numTouchdownEquipoVisitante int(2)
);

