package nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nanifarfalla.app.model.auditorias.AuditoriaPresentacionInsumo;

@Repository
public interface AuditoriaPresentacionInsumoRepository extends JpaRepository<AuditoriaPresentacionInsumo, Integer> {

}
