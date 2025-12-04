package pe.edu.upc.planwasi.dtos;

public class TipoEntidadDTO {
    private Long IdTipoEntidad;
    private String nombreTipoEntidad;

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
