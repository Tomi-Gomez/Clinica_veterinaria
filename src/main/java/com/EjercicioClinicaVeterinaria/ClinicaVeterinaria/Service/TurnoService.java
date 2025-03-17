package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto.TurnoDTO;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy.ITurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService implements ITurnoService{
    @Autowired
    ITurnoRepository turnoRepo;

    @Override
    public List<Turno> getListTurnos() {
        return turnoRepo.findAll();
    }

    @Override
    public List<Turno> getListTurnoFecha(String fecha) {
        return turnoRepo.findAllByFecha(fecha);
    }

    @Override
    public Optional<Turno> getTurno(Long id) {
        return turnoRepo.findById(id);
    }

    @Override
    public void saveTurno(Turno turno) {
        turnoRepo.save(turno);
    }

    @Override
    public TurnoDTO getListTurnoDTO(Long id_turno) {
        TurnoDTO turnoDTO = new TurnoDTO();
        Optional<Turno> turno = this.getTurno(id_turno);

        turnoDTO.setEspecialidad(turno.get().getEspecialidad());
        turnoDTO.setFecha(turno.get().getFecha());
        turnoDTO.setEspecieMascota(turno.get().getMascota().getEspecie());
        turnoDTO.setNombreMascota(turno.get().getMascota().getNombre());
        turnoDTO.setNombreDuenio(turno.get().getDuenio().getNombre());
        turnoDTO.setNumeroDuenio(turno.get().getDuenio().getCelular());

        return turnoDTO;

    }
}
