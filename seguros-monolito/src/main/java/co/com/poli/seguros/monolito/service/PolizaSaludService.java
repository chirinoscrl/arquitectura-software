package co.com.poli.seguros.monolito.service;

import co.com.poli.seguros.monolito.entity.PolizaSalud;
import co.com.poli.seguros.monolito.repository.PolizaSaludRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaSaludService {

    private final PolizaSaludRepository polizaSaludRepository;

    @Autowired
    public PolizaSaludService(PolizaSaludRepository polizaSaludRepository) {
        this.polizaSaludRepository = polizaSaludRepository;
    }

    public List<PolizaSalud> obtenerListadoPolizas() {
        return polizaSaludRepository.findAll();
    }
}