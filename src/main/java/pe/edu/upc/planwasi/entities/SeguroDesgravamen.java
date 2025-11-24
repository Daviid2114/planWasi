package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Seguro_Desgravament")
public class SeguroDesgravamen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdSeguroDesgravament;
    @Column(name="descripcion",nullable = false, length = 50)
    private String descripcion;
    @Column(name="numeroCuotas",nullable = false, length = 50)
    private int numeroCuotas;
    @Column(name="tasa",nullable = false)
    private float tasa;

    public SeguroDesgravamen(Long idSeguroDesgravament, String descripcion, int numeroCuotas, float tasa) {
        IdSeguroDesgravament = idSeguroDesgravament;
        this.descripcion = descripcion;
        this.numeroCuotas = numeroCuotas;
        this.tasa = tasa;
    }
    public SeguroDesgravamen() {
    }

    public Long getIdSeguroDesgravament() {
        return IdSeguroDesgravament;
    }

    public void setIdSeguroDesgravament(Long idSeguroDesgravament) {
        IdSeguroDesgravament = idSeguroDesgravament;
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
