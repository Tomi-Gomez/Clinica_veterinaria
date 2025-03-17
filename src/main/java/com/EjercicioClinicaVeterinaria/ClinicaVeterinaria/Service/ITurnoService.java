package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto.TurnoDTO;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;

import java.util.List;
import java.util.Optional;


public interface ITurnoService {
    public List<Turno> getListTurnos();
    public List<Turno> getListTurnoFecha(String Fecha);
    public Optional<Turno> getTurno(Long id);

    public void saveTurno(Turno turno);

    public TurnoDTO getListTurnoDTO(Long id_turno);
}
