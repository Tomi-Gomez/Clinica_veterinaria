package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITurnoRepository extends JpaRepository<Turno, Long> {
}
