package co.com.poli.seguros.salud.controller;

import co.com.poli.seguros.salud.entity.PolizaSalud;
import co.com.poli.seguros.salud.service.PolizaSaludService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/poliza/salud")
public class PolizaSaludController {

    private final PolizaSaludService polizaSaludService;

    @Autowired
    public PolizaSaludController(PolizaSaludService polizaSaludService) {
        this.polizaSaludService = polizaSaludService;
    }

    @GetMapping
    public List<PolizaSalud> obtenerListadoPolizas() {
        return polizaSaludService.obtenerListadoPolizas();
    }
}