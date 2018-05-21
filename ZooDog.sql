CREATE DATABASE ZooDog;
#Drop database ZooDog;
Use ZooDog;

CREATE TABLE Dog(
    idDog INT AUTO_INCREMENT,
    raza VARCHAR(30) NOT NULL,
    personalidad VARCHAR(30) NOT NULL,
    energia VARCHAR(30) NOT NULL,
    descripcion VARCHAR(30) NOT NULL,
    PRIMARY KEY(idDog)
);

CREATE TABLE Usuario(
    idUsuario INT AUTO_INCREMENT,
    username INT NOT NULL,
    PRIMARY KEY(idUsuario)
);

CREATE TABLE Comentario(
    idComentario INT AUTO_INCREMENT,
    fecha VARCHAR(30),
    comentario VARCHAR(100),
    idUsuario INT NOT NULL,
    PRIMARY KEY(idComentario),
    FOREIGN KEY(idUsuario) REFERENCES Usuario(idUsuario)
);

SELECT * FROM Comentario;