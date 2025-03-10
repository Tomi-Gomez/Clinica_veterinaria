package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;

import java.util.List;

public interface ITurnoService {
    public List<Turno> getListTurnos();
    public List<Turno> getListTurnoFecha(String Fecha);
    public Turno getTurno(Long id);

    public void saveTurno(Turno turno);
}
