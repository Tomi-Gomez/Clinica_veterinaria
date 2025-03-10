package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Turno {
    private Long id_turno;
    private String especialidad;
    private String fecha;

    @OneToOne
    @JoinColumn (name = "id_duenio" , referencedColumnName = "id_duenio")
    private Duenio duenio;

    @OneToOne
    @JoinColumn(name = "id_mascota", referencedColumnName = "id")
    private Mascota mascota;


}
