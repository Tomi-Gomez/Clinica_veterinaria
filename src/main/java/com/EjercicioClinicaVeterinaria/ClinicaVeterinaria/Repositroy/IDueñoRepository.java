package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository<Duenio,Long> {
}
