package org.example.ServicioWEB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaSituacionVulnerableService {
/*
    @Autowired
    private PersonaSituacionVulnerableRepository repository;

    public List<PersonaSituacionVulnerableDTO> obtenerCantidadPersonasPorCantidadMenores() {
        List<Object[]> resultados = repository.obtenerCantidadPersonasPorCantidadMenores();
        List<PersonaSituacionVulnerableDTO> listaResultado = new ArrayList<>();

        for (Object[] resultado : resultados) {
            // Convierte los valores de la consulta a los tipos correspondientes
            Integer cantidadMenores = (Integer) resultado[0];  // La cantidad de menores a cargo
            Long cantidadPersonas = ((BigInteger) resultado[1]).longValue();  // La cantidad de personas con esa cantidad de menores

            // Crear el DTO con los valores obtenidos
            PersonaSituacionVulnerableDTO dto = new PersonaSituacionVulnerableDTO(cantidadMenores, cantidadPersonas);
            listaResultado.add(dto);
        }

        return listaResultado;
    }*/
}

