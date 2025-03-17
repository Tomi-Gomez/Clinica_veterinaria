package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Controller;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto.TurnoDTO;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TurnoController {
    @Autowired
    ITurnoService turnoService;

    @PostMapping ("/turno/Create")
    public String creteTurno(@RequestBody Turno turno){
        turnoService.saveTurno(turno);
        return "El turno fue guardado correctamente";
    }

    @GetMapping ("/turno/listTurnos")
    public List<Turno> getListTurnos(){
        return turnoService.getListTurnos();
    }

    @GetMapping ("/turno/listTurnoporFecha/{fecha}")
    public List<Turno> getTurnoFecha(@PathVariable String fecha){
        List<Turno> listTurnos = turnoService.getListTurnos();
        List<Turno> listTurnFecha = new ArrayList<>();
        for (Turno l:listTurnos){
            if (l.getFecha().equalsIgnoreCase(fecha)){
                listTurnFecha.add(l);
            }
        }
        return listTurnFecha;
    }

    @GetMapping ("/turno/listTurno/{id}")
    public Optional<Turno> getTurnoId(@PathVariable Long id){
        return turnoService.getTurno(id);
    }

    @GetMapping("/turno/{id_turno}")
    public Optional<TurnoDTO> getListTurno(@PathVariable Long id_turno){
        return Optional.ofNullable(turnoService.getListTurnoDTO(id_turno));
    }
}
