package pe.edu.upc.planwasi.dtos;

import jakarta.persistence.Column;

public class CapitalizacionDTO {
    private int idCapitalizacion;
    private String tipoCapitalizacion;

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
