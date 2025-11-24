package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="TipoProyecto")
public class TipoProyecto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idTipoProyecto;
    @Column(name = "nombreTipoProyecto", nullable = false, length = 50)
    private String nombreTipoProyecto;

    public TipoProyecto() {
    }

    public TipoProyecto(Long idTipoProyecto, String nombreTipoProyecto) {
        this.idTipoProyecto = idTipoProyecto;
        this.nombreTipoProyecto = nombreTipoProyecto;
    }

    public Long getIdTipoProyecto() {
        return idTipoProyecto;
    }

    public void setIdTipoProyecto(Long idTipoProyecto) {
        this.idTipoProyecto = idTipoProyecto;
    }

    public String getNombreTipoProyecto() {
        return nombreTipoProyecto;
    }

    public void setNombreTipoProyecto(String nombreTipoProyecto) {
        this.nombreTipoProyecto = nombreTipoProyecto;
    }
}
