package org.example.ServicioWEB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/personasituacionvulnerable")
public class PersonaSituacionVulnerableController {

    @Autowired
    private PersonaSituacionVulnerableRepository personaSituacionVulnerableRepository;

    @GetMapping("/personas-por-localidad")
    public List<Map<String, Object>> obtenerPersonasPorLocalidad() {
        List<Object[]> results = personaSituacionVulnerableRepository.obtenerPersonasPorLocalidad();

        // Convertir los resultados a un formato más amigable
        List<Map<String, Object>> response = new ArrayList<>();
        for (Object[] result : results) {
            Map<String, Object> row = new HashMap<>();
            row.put("localidad", result[0]);
            row.put("cantidadPersonas", result[1]);
            row.put("nombresPersonas", result[2]);
            response.add(row);
        }

        return response;
    }
}


