package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Seguro_Inmobiliario")
public class SeguroInmobiliario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdSeguroInmobiliario;
    @Column(name="descripcion",nullable = false, length = 50)
    private String descripcion;
    @Column(name="numeroCuotas",nullable = false, length = 50)
    private int numeroCuotas;
    @Column(name="tasa",nullable = false)
    private float tasa;

    public SeguroInmobiliario(Long idSeguroInmobiliario, String descripcion, int numeroCuotas, float tasa) {
        IdSeguroInmobiliario = idSeguroInmobiliario;
        this.descripcion = descripcion;
        this.numeroCuotas = numeroCuotas;
        this.tasa = tasa;
    }

    public SeguroInmobiliario() {

    }

    public Long getIdSeguroInmobiliario() {
        return IdSeguroInmobiliario;
    }

    public void setIdSeguroInmobiliario(Long idSeguroInmobiliario) {
        IdSeguroInmobiliario = idSeguroInmobiliario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}
