package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "EntidadFinanciera")
public class EntidadFinanciera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntidadFinanciera;
    @Column(name = "nombres", nullable = false, length = 40)
    private String nombres;
    @Column(name = "ruc", nullable = false)
    private int ruc;
    @Column(name="tasaNominal",nullable = false)
    private float tasaNominal;
    @Column(name="tasaEfectiva",nullable = false)
    private float tasaEfectiva;

    @ManyToOne
    @JoinColumn(name = "TipoEntidad")
    private TipoEntidad tipoEntidad;

    public EntidadFinanciera() {
    }

    public EntidadFinanciera(int idEntidadFinanciera, String nombres, int ruc, float tasaNominal, float tasaEfectiva, TipoEntidad tipoEntidad) {
        this.idEntidadFinanciera = idEntidadFinanciera;
        this.nombres = nombres;
        this.ruc = ruc;
        this.tasaNominal = tasaNominal;
        this.tasaEfectiva = tasaEfectiva;
        this.tipoEntidad = tipoEntidad;
    }

    public int getIdEntidadFinanciera() {
        return idEntidadFinanciera;
    }

    public void setIdEntidadFinanciera(int idEntidadFinanciera) {
        this.idEntidadFinanciera = idEntidadFinanciera;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public float getTasaNominal() {
        return tasaNominal;
    }

    public void setTasaNominal(float tasaNominal) {
        this.tasaNominal = tasaNominal;
    }

    public float getTasaEfectiva() {
        return tasaEfectiva;
    }

    public void setTasaEfectiva(float tasaEfectiva) {
        this.tasaEfectiva = tasaEfectiva;
    }

    public TipoEntidad getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(TipoEntidad tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }
}
