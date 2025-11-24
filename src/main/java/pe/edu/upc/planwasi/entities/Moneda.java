package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Moneda")
public class Moneda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMoneda;
    @Column(name = "nombreMoneda", nullable = false, length = 10)
    private String nombreMoneda;
    @Column(name = "simboloMoneda", nullable = false, length = 1)
    private String simboloMoneda;

    public Moneda() {
    }

    public Moneda(Long idMoneda, String nombreMoneda, String simboloMoneda) {
        this.idMoneda = idMoneda;
        this.nombreMoneda = nombreMoneda;
        this.simboloMoneda = simboloMoneda;
    }

    public Long getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(Long idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public String getSimboloMoneda() {
        return simboloMoneda;
    }

    public void setSimboloMoneda(String simboloMoneda) {
        this.simboloMoneda = simboloMoneda;
    }
}
