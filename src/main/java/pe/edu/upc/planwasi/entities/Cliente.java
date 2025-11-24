package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 50)
    private String apellidos;
    @Column(name = "docIdentidad", nullable = false, length = 15)
    private String docIdentidad;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;
    @Column(name = "numeroDependientes", nullable = false)
    private int numeroDependientes;
    @Column(name = "trabaja", nullable = false)
    private Boolean trabaja;
    @Column(name = "ingresoMensual", nullable = false)
    private float ingresoMensual;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nombres, String apellidos, String docIdentidad, int edad, String correo, int numeroDependientes, Boolean trabaja, float ingresoMensual, Usuario usuario) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.docIdentidad = docIdentidad;
        this.edad = edad;
        this.correo = correo;
        this.numeroDependientes = numeroDependientes;
        this.trabaja = trabaja;
        this.ingresoMensual = ingresoMensual;
        this.usuario = usuario;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroDependientes() {
        return numeroDependientes;
    }

    public void setNumeroDependientes(int numeroDependientes) {
        this.numeroDependientes = numeroDependientes;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Boolean trabaja) {
        this.trabaja = trabaja;
    }

    public float getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}