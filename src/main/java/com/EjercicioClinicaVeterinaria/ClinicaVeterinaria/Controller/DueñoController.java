package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Controller;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Duenio;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service.IDueñoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DueñoController {

    @Autowired
    IDueñoService IDueñoServ;

    @GetMapping("/Dueño/TraerLista")
    public List<Duenio> getListaDueño(){
        return IDueñoServ.getListaDueño();
    }

    @PostMapping("/Dueño/Crear")
    public String saveDueño(@RequestBody Duenio dueño){
        IDueñoServ.saveDueño(dueño);
        return "El dueño fue creado correctamente";
    }

    @DeleteMapping("/Dueño/Borrar/{id}")
    public String deleteDueño(@PathVariable Long id){
        IDueñoServ.deleteDueño(id);
        return "El dueño se borro correctamente";
    }

    @GetMapping("/Dueño/Buscar/{id}")
    public Duenio findDueño(@PathVariable Long id){
        return IDueñoServ.findDueño(id);
    }
}
