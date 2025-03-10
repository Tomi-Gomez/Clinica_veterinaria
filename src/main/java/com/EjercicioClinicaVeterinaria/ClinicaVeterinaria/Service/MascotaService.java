package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Dto.MascotaDuenioDTO;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Duenio;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Mascota;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy.IMascotaRepository;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository ImascoRepo;

    @Override
    public List<Mascota> getListaMascotas() {
        return ImascoRepo.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        ImascoRepo.save(mascota);
    }

    @Override
    public void daleteMascota(Long id) {
        ImascoRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masco = ImascoRepo.findById(id).orElse(null);
        return masco;
    }

    @Override
    public List<Mascota> findEspecie_Raza() {
        String especie = "perro";
        String raza = "caniche";

        List<Mascota> listaMasco = new ArrayList<>();
        for (Mascota mas: ImascoRepo.findAll()){
            if(mas.getEspecie().equalsIgnoreCase(especie) && mas.getRaza().equalsIgnoreCase(raza)){
                listaMasco.add(mas);
            }
        }

        return listaMasco;
    }

    @Override
    public MascotaDuenioDTO findDatosCombinados(Long id_masco) {
        MascotaDuenioDTO mascotaDuenioDTO = new MascotaDuenioDTO();
        Mascota masco = this.findMascota(id_masco);

        mascotaDuenioDTO.setNombre_Mascota(masco.getNombre());
        mascotaDuenioDTO.setRaza(masco.getRaza());
        mascotaDuenioDTO.setEspecie(masco.getEspecie());
        mascotaDuenioDTO.setNombre_duenio(masco.getDuenio().getNombre());
        mascotaDuenioDTO.setApellido_duenio(masco.getDuenio().getApellido());


        return mascotaDuenioDTO;
    }


}
