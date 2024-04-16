CREATE TABLE poliza_auto
(
    id             BIGINT       NOT NULL,
    nombre_tomador VARCHAR(255) NOT NULL,
    nombre_titular VARCHAR(255) NOT NULL,
    numero_poliza  VARCHAR(255) NOT NULL,
    fecha_inicio   date         NOT NULL,
    fecha_fin      date         NOT NULL,
    cobertura      VARCHAR(255) NOT NULL,
    placa_auto     VARCHAR(255) NOT NULL,
    marca_auto     VARCHAR(255) NOT NULL,
    CONSTRAINT pk_poliza_auto PRIMARY KEY (id)
);

ALTER TABLE poliza_auto
    ADD CONSTRAINT uc_poliza_auto_numero_poliza UNIQUE (numero_poliza);

ALTER TABLE poliza_auto MODIFY id INT AUTO_INCREMENT;