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
}
