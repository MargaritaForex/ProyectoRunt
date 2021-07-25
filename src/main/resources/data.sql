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

insert into estudiante (nombre)values('Afrodita');
insert into estudiante (nombre)values('Apolo');
insert into estudiante (nombre)values('Ares');
insert into estudiante (nombre)values('Artemisa');
insert into estudiante (nombre)values('Atenea');
insert into estudiante (nombre)values('Dionisio');
insert into estudiante (nombre)values('Hefesto');
insert into estudiante (nombre)values('Hera');
insert into estudiante (nombre)values('Hermes');
insert into estudiante (nombre)values('Hades');
insert into estudiante (nombre)values('Poseidón');
insert into estudiante (nombre)values('Zeus');

insert into asignatura (nombre)values('Matematicas');
insert into asignatura (nombre)values('Español');
insert into asignatura (nombre)values('Ingles basico');
insert into asignatura (nombre)values('Ingles avanzado');
insert into asignatura (nombre)values('Pre ifces');