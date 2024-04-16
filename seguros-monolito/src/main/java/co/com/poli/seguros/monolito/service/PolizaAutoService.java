package co.com.poli.seguros.monolito.service;

import co.com.poli.seguros.monolito.entity.PolizaAuto;
import co.com.poli.seguros.monolito.repository.PolizaAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaAutoService {

    private final PolizaAutoRepository polizaAutoRepository;

    @Autowired
    public PolizaAutoService(PolizaAutoRepository polizaAutoRepository) {
        this.polizaAutoRepository = polizaAutoRepository;
    }

    public List<PolizaAuto> obtenerListadoPolizas() {
        return polizaAutoRepository.findAll();
    }
}