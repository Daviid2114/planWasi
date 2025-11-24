package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Seguro_Desgravament")
public class SeguroInmobiliario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdSeguroDesgravament;
    @Column(name="descripcion",nullable = false, length = 50)
    private String descripcion;
    @Column(name="numeroCuotar",nullable = false, length = 50)
    )
}
