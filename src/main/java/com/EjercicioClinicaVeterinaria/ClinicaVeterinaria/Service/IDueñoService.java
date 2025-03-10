package com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Service;

import com.EjercicioClinicaVeterinaria.ClinicaVeterinaria.Model.Duenio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDueñoService {

    public List<Duenio> getListaDueño();

    public void saveDueño(Duenio dueño);

    public void deleteDueño (Long id);

    public Duenio findDueño(Long id);
}
