package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDuenioDTO {
    private String nombre_Mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;
}
