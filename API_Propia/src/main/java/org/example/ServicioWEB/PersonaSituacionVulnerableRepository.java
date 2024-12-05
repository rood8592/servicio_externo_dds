package org.example.ServicioWEB;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaSituacionVulnerableRepository extends JpaRepository<PersonaSituacionVulnerable, Integer> {

    @Query(value = "SELECT " +
            "l.nombre AS localidad, " +
            "COUNT(p.id) AS cantidadPersonas, " +
            "GROUP_CONCAT(p2.nombre ORDER BY p2.nombre) AS nombresPersonas " +
            "FROM ddstp.personasituacionvulnerable p " +
            "JOIN ddstp.rol r ON r.id = p.id " +
            "JOIN ddstp.persona p2 ON r.rol_persona = p2.id " +
            "JOIN ddstp.domicilio d ON d.id = p2.persona_domicilio " +
            "JOIN ddstp.localidad l ON d.domicilio_localidad = l.id " +
            "GROUP BY l.nombre", nativeQuery = true)
    List<Object[]> obtenerPersonasPorLocalidad();
}

