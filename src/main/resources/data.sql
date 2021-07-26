    CREATE TABLE `estudiante` (
	`id` long auto_increment,
    `nombre` varchar(255),
     PRIMARY KEY (id)
    );
    
    
    CREATE TABLE `asignatura` (
	`id` long auto_increment,
    `nombre` varchar(255),
     PRIMARY KEY (id)
    );
    
    CREATE TABLE `curso` (
	`id` long auto_increment,
    `grado` varchar(255),
     PRIMARY KEY (id)
    );
    
      CREATE TABLE `colegio` (
	`id` long auto_increment,
    `nombre` varchar(255),
     PRIMARY KEY (id)
    );

insert into estudiante (nombre)values('Afrodita'),('Apolo'),('Ares'),('Artemisa'),('Atenea'),('Dionisio'),('Hefesto'),('Hera'),('Hermes'),('Hades'),('Poseidón'),('Zeus');

insert into asignatura (nombre)values('Matematicas'),('Español'),('Ingles basico'),('Ingles avanzado'),('Pre ifces');

insert into curso (grado)values('10A'),('10B'),('11A'),('11B');

insert into colegio (nombre)values('El colegio del Olimpo');