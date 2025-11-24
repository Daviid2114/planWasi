package pe.edu.upc.planwasi.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Seguro_Desgravament")
public class SeguroDesgravamen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdSeguroDesgravament;
    @Column(name="descripcion",nullable = false, length = 50)
    private String descripcion;
    @Column(name="numeroCuotas",nullable = false, length = 50)
    private int numeroCuotas;
    @Column(name="tasa",nullable = false)
    private float tasa;
}
