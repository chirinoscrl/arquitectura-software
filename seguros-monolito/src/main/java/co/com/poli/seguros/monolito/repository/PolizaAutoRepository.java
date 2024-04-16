package co.com.poli.seguros.monolito.repository;

import co.com.poli.seguros.monolito.entity.PolizaAuto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizaAutoRepository extends JpaRepository<PolizaAuto, Long> {
}