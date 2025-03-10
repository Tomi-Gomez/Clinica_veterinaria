package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Duenio;
import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Repositroy.IDueñoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DueñoService implements IDueñoService{

    @Autowired
    IDueñoRepository IDueñoRepo;

    @Override
    public List<Duenio> getListaDueño() {
        return IDueñoRepo.findAll();
    }

    @Override
    public void saveDueño(Duenio dueño) {
        IDueñoRepo.save(dueño);
    }

    @Override
    public void deleteDueño(Long id) {
        IDueñoRepo.deleteById(id);
    }

    @Override
    public Duenio findDueño(Long id) {
        return IDueñoRepo.findById(id).orElse(null);
    }
}
