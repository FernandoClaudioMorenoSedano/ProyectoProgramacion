use pruebas1dam;

CREATE TABLE entrenador (
  nombre varchar(30) NOT NULL,
  numeroDeEquipos int DEFAULT NULL,
  PRIMARY KEY (nombre)
);

CREATE TABLE equipo (
  nombre varchar(30) NOT NULL,
  nombreEntrenador varchar(30) DEFAULT NULL,
  raza varchar(30) DEFAULT NULL,
  nombreEstadio varchar(30) DEFAULT NULL,
  PRIMARY KEY (nombre)
);

CREATE TABLE jugador (
  nombre varchar(30) NOT NULL,
  nombreEquipo varchar(30) DEFAULT NULL,
  movimiento int DEFAULT NULL,
  fuerza int DEFAULT NULL,
  agilidad int DEFAULT NULL,
  armadura int DEFAULT NULL,
  numMaxPorEquipo int DEFAULT NULL,
  PRIMARY KEY (nombre)
);

CREATE TABLE partido (
  equipoLocal varchar(30) DEFAULT NULL,
  equipoVisitante varchar(30) DEFAULT NULL,
  numTouchdownEquipoLocal int DEFAULT NULL,
  numTouchdownEquipoVisitante int DEFAULT NULL
);
ALTER TABLE Entrenador DROP COLUMN numeroDeEquipos;