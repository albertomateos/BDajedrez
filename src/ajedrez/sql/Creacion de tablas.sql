-- fecha: 24/04/2019
-- nombre: Alberto Mateos
-- curso: 1º Daw
CREATE TABLE torneo (
    ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    NOMBRE VARCHAR(20) NOT NULL,
    PAÍS VARCHAR(15),
    CIUDAD VARCHAR(25),
    PROVINCIA VARCHAR(15),
    FECHA DATE,
    CONSTRAINT ID_torneo_PK PRIMARY KEY (ID)
    );

CREATE TABLE jugadores (
     ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
     CÓDIGO CHAR(2),
     NOMBRE VARCHAR(20) NOT NULL,
     APELLIDOS VARCHAR (30) NOT NULL,
     TELEFONO VARCHAR(15),
     EMAIL VARCHAR (30),
     FECHA_NACIMIENTO DATE,
     PAÍS VARCHAR(15),
     ELO SMALLINT,
     FOTO VARCHAR (30),
     CAMPEON BOOLEAN,
     SUBCAMPEON BOOLEAN,
     TORNEO INTEGER NOT NULL,
     CONSTRAINT ID_jugadores_PK PRIMARY KEY (ID),
     CONSTRAINT ID_TORNEO_FK FOREIGN KEY (TORNEO) REFERENCES TORNEO (ID)
     );




