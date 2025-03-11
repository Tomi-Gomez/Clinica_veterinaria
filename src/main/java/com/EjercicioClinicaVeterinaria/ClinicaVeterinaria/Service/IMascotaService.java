package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto.MascotaDuenioDTO;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Mascota;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMascotaService {

    public List<Mascota> getListaMascotas();

    public void saveMascota(Mascota mascota);

    public void daleteMascota(Long id);

    public Mascota findMascota(Long id);

    public List<Mascota> findEspecie_Raza();

    public MascotaDuenioDTO findDatosCombinados(Long id_masco);


}
