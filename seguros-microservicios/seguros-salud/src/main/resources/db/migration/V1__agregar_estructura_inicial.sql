CREATE TABLE poliza_salud
(
    id                  BIGINT       NOT NULL,
    nombre_titular      VARCHAR(255) NOT NULL,
    nombre_beneficiario VARCHAR(255) NOT NULL,
    numero_poliza       VARCHAR(255) NOT NULL,
    fecha_inicio        date         NOT NULL,
    fecha_fin           date         NOT NULL,
    cobertura           VARCHAR(255) NOT NULL,
    CONSTRAINT pk_poliza_salud PRIMARY KEY (id)
);
ALTER TABLE poliza_salud
    ADD CONSTRAINT uc_poliza_salud_numero_poliza UNIQUE (numero_poliza);

ALTER TABLE poliza_salud MODIFY id INT AUTO_INCREMENT;