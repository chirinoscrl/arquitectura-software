package co.com.poli.seguros.auto.controller;

import co.com.poli.seguros.auto.entity.PolizaAuto;
import co.com.poli.seguros.auto.service.PolizaAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/poliza/auto")
public class PolizaAutoController {

    private final PolizaAutoService polizaAutoService;

    @Autowired
    public PolizaAutoController(PolizaAutoService polizaAutoService) {
        this.polizaAutoService = polizaAutoService;
    }

    @GetMapping
    public List<PolizaAuto> obtenerListadoPolizas() {
        return polizaAutoService.obtenerListadoPolizas();
    }
}