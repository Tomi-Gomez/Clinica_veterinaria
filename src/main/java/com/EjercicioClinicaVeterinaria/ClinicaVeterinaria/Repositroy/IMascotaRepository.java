package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Long> {
}
