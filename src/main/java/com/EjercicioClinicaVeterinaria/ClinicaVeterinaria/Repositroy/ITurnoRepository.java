package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITurnoRepository extends JpaRepository<Turno, Long> {
    public List<Turno> findAllByFecha(String Fecha);
}
