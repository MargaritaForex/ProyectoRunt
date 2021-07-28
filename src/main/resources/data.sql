    CREATE TABLE `estudiante` (
	`id` long auto_increment,
    `nombre` varchar(255),
     PRIMARY KEY (id)
    );
    
    
     CREATE TABLE `asignatura_estudiante` (
	`id` long auto_increment,
	`id_estudiante` long,
	`id_asignatura` long,
	`id_curso` long, 
     PRIMARY KEY (id)
    );
    
     CREATE TABLE `docente` (
	`id` long auto_increment,
	`nombre` varchar(255),
     PRIMARY KEY (id)     
    );
    
    
    CREATE TABLE `asignatura` (
	`id` long auto_increment,
    `nombre` varchar(255),     
    `id_curso` long, 
     PRIMARY KEY (id)
    );
    
    
    CREATE TABLE `curso` (
	`id` long auto_increment,
	`id_colegio` long,
	`id_docente` long,   
    `grado` varchar(255), 
     PRIMARY KEY (id)
    );
    
      CREATE TABLE `colegio` (
	`id` long auto_increment,
    `nombre` varchar(255),
     PRIMARY KEY (id)
    );

insert into estudiante (nombre)values('Afrodita'),('Apolo'),('Ares'),('Artemisa'),('Atenea'),('Dionisio'),('Hefesto'),('Hera'),('Hermes'),('Hades'),('Poseidón'),('Zeus');

insert into curso (grado,id_colegio, id_docente)values('10A',1,1),('10B',1,1),('11A',2,2),('11B',2,2);

insert into asignatura (nombre,id_curso)values('Matematicas',1),('Matematicas',2),('Español',1),('Ingles basico',2),('Ingles avanzado',3),('Pre ifces',2);

insert into docente (nombre)values('Némesis'),('Príapo'),('Iris');

insert into colegio (nombre)values('El colegio del Olimpo');

insert into asignatura_estudiante (id_estudiante,id_asignatura,id_curso)values(1,1,1),(2,1,1);