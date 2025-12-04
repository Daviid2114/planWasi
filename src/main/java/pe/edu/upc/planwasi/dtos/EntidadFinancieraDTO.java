package pe.edu.upc.planwasi.dtos;

public class EntidadFinancieraDTO {
    private int idEntidadFinanciera;
    private String nombres;
    private int ruc;
    private float tasaNominal;
    private float tasaEfectiva;

    private Long idTipoEntidad;

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

    public Long getIdTipoEntidad() {
        return idTipoEntidad;
    }

    public void setIdTipoEntidad(Long idTipoEntidad) {
        this.idTipoEntidad = idTipoEntidad;
    }
}
