package co.com.poli.seguros.salud.repository;

import co.com.poli.seguros.salud.entity.PolizaSalud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizaSaludRepository extends JpaRepository<PolizaSalud, Long> {
}