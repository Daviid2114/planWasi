package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="TipoEntidad")
public class TipoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdTipoEntidad;
    @Column(name = "nombreTipoEntidad", nullable = false, length = 50)
    private String nombreTipoEntidad;

    public TipoEntidad() {
    }

    public TipoEntidad(Long idTipoEntidad, String nombreTipoEntidad) {
        IdTipoEntidad = idTipoEntidad;
        this.nombreTipoEntidad = nombreTipoEntidad;
    }

    public Long getIdTipoEntidad() {
        return IdTipoEntidad;
    }

    public void setIdTipoEntidad(Long idTipoEntidad) {
        IdTipoEntidad = idTipoEntidad;
    }

    public String getNombreTipoEntidad() {
        return nombreTipoEntidad;
    }

    public void setNombreTipoEntidad(String nombreTipoEntidad) {
        this.nombreTipoEntidad = nombreTipoEntidad;
    }
}
