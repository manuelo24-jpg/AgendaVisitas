package com.example.backend.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 255)
    private String direccion;

    @Column(length = 15)
    private String telefono;

    @Column(length = 100)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaRegistro;

    @Lob
    private String notas;

    @Column(length = 100)
    private String ciudad;

    @Column(length = 100)
    private String pais;

    @Column(length = 10)
    private String codigoPostal;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visita> visitas;

}