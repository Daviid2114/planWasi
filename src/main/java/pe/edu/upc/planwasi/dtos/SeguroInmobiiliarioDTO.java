package pe.edu.upc.planwasi.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class SeguroInmobiiliarioDTO {

    private Long IdSeguroInmobiliario;
    private String descripcion;
    private int numeroCuotas;
    private float tasa;

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
