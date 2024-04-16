package co.com.poli.seguros.auto.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "poliza_auto")
public class PolizaAuto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_tomador", nullable = false)
    private String nombreTomador;

    @Column(name = "nombre_titular", nullable = false)
    private String nombreTitular;

    @Column(name = "numero_poliza", unique = true, nullable = false)
    private String numeroPoliza;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "cobertura", nullable = false)
    private String cobertura;

    @Column(name = "placa_auto", nullable = false)
    private String placaAuto;

    @Column(name = "marca_auto", nullable = false)
    private String marcaAuto;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTomador() {
        return nombreTomador;
    }
    public void setNombreTomador(String nombreTomador) {
        this.nombreTomador = nombreTomador;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }
    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }
    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }
    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolizaAuto that = (PolizaAuto) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PolizaAuto{" +
                "id=" + id +
                ", nombreTomador='" + nombreTomador + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroPoliza='" + numeroPoliza + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", cobertura='" + cobertura + '\'' +
                ", placaAuto='" + placaAuto + '\'' +
                ", marcaAuto='" + marcaAuto + '\'' +
                '}';
    }
}