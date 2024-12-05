package org.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;



    @RestController
    public class LocalidadController {

        @Autowired
        private LocalidadRepository localidadRepository;

        @GetMapping("/localidades")
        public List<Localidad> obtenerLocalidades() {
            return localidadRepository.findAll();
        }
    }

