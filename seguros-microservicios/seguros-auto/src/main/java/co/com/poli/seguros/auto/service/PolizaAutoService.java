package co.com.poli.seguros.auto.service;

import co.com.poli.seguros.auto.entity.PolizaAuto;
import co.com.poli.seguros.auto.repository.PolizaAutoRepository;
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