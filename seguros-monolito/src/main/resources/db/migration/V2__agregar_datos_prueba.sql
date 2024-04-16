INSERT INTO poliza_salud (nombre_titular, nombre_beneficiario, numero_poliza, fecha_inicio, fecha_fin, cobertura)
VALUES
    ('Juan Pérez', 'Ana Pérez', 'PS123456', '2023-01-01', '2024-01-01', 'Cobertura completa'),
    ('Carlos López', 'Maria López', 'PS789012', '2023-02-01', '2024-02-01', 'Cobertura básica'),
    ('Roberto González', 'Isabel González', 'PS345678', '2023-03-01', '2024-03-01', 'Cobertura media'),
    ('Eduardo Rodríguez', 'Patricia Rodríguez', 'PS901234', '2023-04-01', '2024-04-01', 'Cobertura alta'),
    ('Gabriel Torres', 'Carolina Torres', 'PS567890', '2023-05-01', '2024-05-01', 'Cobertura baja');

INSERT INTO poliza_auto (nombre_tomador, nombre_titular, numero_poliza, fecha_inicio, fecha_fin, cobertura, placa_auto, marca_auto)
VALUES
    ('Juan Pérez', 'Ana Pérez', 'PA345678', '2022-01-01', '2023-01-01', 'Cobertura completa', 'ABC123', 'Toyota'),
    ('Carlos López', 'Maria López', 'PA901234', '2022-02-01', '2023-02-01', 'Cobertura básica', 'DEF456', 'Honda'),
    ('Roberto González', 'Isabel González', 'PA567890', '2022-03-01', '2023-03-01', 'Cobertura media', 'GHI789', 'Ford'),
    ('Eduardo Rodríguez', 'Patricia Rodríguez', 'PA123456', '2022-04-01', '2023-04-01', 'Cobertura alta', 'JKL012', 'Chevrolet'),
    ('Gabriel Torres', 'Carolina Torres', 'PA789012', '2022-05-01', '2023-05-01', 'Cobertura baja', 'MNO345', 'Nissan');