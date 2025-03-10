package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Controller;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Turno;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnoController {
    @Autowired
    ITurnoService turnoService;

    @PostMapping ("/turno/Create")
    public String creteTurno(@RequestBody Turno turno){
        turnoService.saveTurno(turno);
        return "El turno fue guardado correctamente";
    }

}
