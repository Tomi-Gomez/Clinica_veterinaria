package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_duenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    public Duenio() {
    }

    public Duenio(Long id_duenio, String dni, String nombre, String apellido, String celular) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}
