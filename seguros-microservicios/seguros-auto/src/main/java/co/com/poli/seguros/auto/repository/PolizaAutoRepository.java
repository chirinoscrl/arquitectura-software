package co.com.poli.seguros.auto.repository;

import co.com.poli.seguros.auto.entity.PolizaAuto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizaAutoRepository extends JpaRepository<PolizaAuto, Long> {
}