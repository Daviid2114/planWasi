package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "capitalizaciones")
public class Capitalizacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCapitalizacion;

    @Column(name = "tipoCapitalizacion", nullable = false, length = 50)
    private String tipoCapitalizacion;

    public Capitalizacion(){
    }

    public Capitalizacion(int idCapitalizacion, String tipoCapitalizacion) {
        this.idCapitalizacion = idCapitalizacion;
        this.tipoCapitalizacion = tipoCapitalizacion;
    }

    public int getIdCapitalizacion() {
        return idCapitalizacion;
    }

    public void setIdCapitalizacion(int idCapitalizacion) {
        this.idCapitalizacion = idCapitalizacion;
    }

    public String getTipoCapitalizacion() {
        return tipoCapitalizacion;
    }

    public void setTipoCapitalizacion(String tipoCapitalizacion) {
        this.tipoCapitalizacion = tipoCapitalizacion;
    }
}
