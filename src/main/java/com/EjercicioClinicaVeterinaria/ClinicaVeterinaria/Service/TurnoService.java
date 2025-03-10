package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TurnoService implements ITurnoService{
    @Autowired
    ITurnoService turnoRepo;

    @Override
    public List<Turno> getListTurnos() {
        return turnoRepo.getListTurnos();
    }

    @Override
    public List<Turno> getListTurnoFecha(String fecha) {
        return turnoRepo.getListTurnoFecha(fecha);
    }

    @Override
    public Turno getTurno(Long id) {
        return turnoRepo.getTurno(id);
    }

    @Override
    public void saveTurno(Turno turno) {
        turnoRepo.saveTurno(turno);
    }
}
