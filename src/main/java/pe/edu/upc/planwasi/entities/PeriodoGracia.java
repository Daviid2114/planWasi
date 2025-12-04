package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "periodogracias")
public class PeriodoGracia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPeriodoGracia;

    @Column(name = "tipoPeriodo", nullable = false, length = 50)
    private String tipoPeriodo;

    public PeriodoGracia() {
    }

    public PeriodoGracia(int idPeriodoGracia, String tipoPeriodo) {
        this.idPeriodoGracia = idPeriodoGracia;
        this.tipoPeriodo = tipoPeriodo;
    }

    public int getIdPeriodoGracia() {
        return idPeriodoGracia;
    }

    public void setIdPeriodoGracia(int idPeriodoGracia) {
        this.idPeriodoGracia = idPeriodoGracia;
    }

    public String getTipoPeriodo() {
        return tipoPeriodo;
    }

    public void setTipoPeriodo(String tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
    }
}
