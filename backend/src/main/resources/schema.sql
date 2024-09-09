CREATE TABLE Clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(15),
    email VARCHAR(100),
    fecha_registro DATE,
    notas TEXT
);

CREATE TABLE Visitas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT,
    fecha DATE NOT NULL,
    descripcion TEXT,
    duracion INT, 
    tipo_visita ENUM('Consulta', 'Revisión', 'Seguimiento', 'Otro'), 
    FOREIGN KEY (cliente_id) REFERENCES Clientes(id)
);
