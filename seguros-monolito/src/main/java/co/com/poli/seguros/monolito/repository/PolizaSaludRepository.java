package co.com.poli.seguros.monolito.repository;

import co.com.poli.seguros.monolito.entity.PolizaSalud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizaSaludRepository extends JpaRepository<PolizaSalud, Long> {
}