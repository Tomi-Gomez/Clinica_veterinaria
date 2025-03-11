package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
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
