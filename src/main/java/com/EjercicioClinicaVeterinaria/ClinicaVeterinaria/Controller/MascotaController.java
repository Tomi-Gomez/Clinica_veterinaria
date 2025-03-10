package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Controller;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto.MascotaDuenioDTO;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Mascota;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    IMascotaService IMascoServ;

    @GetMapping("/Mascota/TraerLista")
    public List<Mascota> getListaMascota(){
        List<Mascota> listaMascota = IMascoServ.getListaMascotas();
        return listaMascota;
    }

    @PostMapping("/Mascota/Crear")
    public String saveMascota(@RequestBody Mascota masco){
        IMascoServ.saveMascota(masco);
        return "La mascota fue creada correctamente";
    }

    @DeleteMapping("/Mascota/Borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        IMascoServ.daleteMascota(id);
        return "La mascota fue eliminada correctamente";
    }

    @GetMapping("/Mascota/Buscar/{id}")
    public Mascota findMascota(@PathVariable Long id){
        Mascota masco = IMascoServ.findMascota(id);
        return masco;
    }

    @GetMapping("/Mascota/Buscar/razaEspecie")
    public List<Mascota> findRaza_especie(){
        List<Mascota> listMasco = IMascoServ.findEspecie_Raza();
        return listMasco;
    }

    @GetMapping("/Mascota/Buscar/datosDto/{idMasco}")
    public MascotaDuenioDTO findMascoDuenio(@PathVariable Long idMasco){
        return IMascoServ.findDatosCombinados(idMasco);
    }

    
}
