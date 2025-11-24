package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Inmueble")
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInmueble;
    @Column(name = "nombreProyecto", nullable = false, length = 100)
    private String nombreProyecto;
    @Column(name = "descripcionProyecto", nullable = false, length = 500)
    private String descripcionProyecto;
    @Column(name = "direccionProyecto", nullable = false, length = 100)
    private String direccionProyecto;
    @Column(name = "area_m2", nullable = false)
    private float area_m2;
    @Column(name = "precioVenta", nullable = false)
    private float precioVenta;
    @Column(name = "estado", nullable = false, length = 100)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "TipoProyecto")
    private TipoProyecto tipoProyecto;
    @ManyToOne
    @JoinColumn(name = "Usuario")
    private Usuario usuario;

    public Inmueble() {
    }

    public Inmueble(int idInmueble, String nombreProyecto, String descripcionProyecto, String direccionProyecto, float area_m2, float precioVenta, String estado, TipoProyecto tipoProyecto, Usuario usuario) {
        this.idInmueble = idInmueble;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.direccionProyecto = direccionProyecto;
        this.area_m2 = area_m2;
        this.precioVenta = precioVenta;
        this.estado = estado;
        this.tipoProyecto = tipoProyecto;
        this.usuario = usuario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getDireccionProyecto() {
        return direccionProyecto;
    }

    public void setDireccionProyecto(String direccionProyecto) {
        this.direccionProyecto = direccionProyecto;
    }

    public float getArea_m2() {
        return area_m2;
    }

    public void setArea_m2(float area_m2) {
        this.area_m2 = area_m2;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoProyecto getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(TipoProyecto tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
