package org.example.ServicioWEB;

public class PersonaSituacionVulnerableDTO {

    private Integer cantidadMenores;  // Cantidad de menores a cargo
    private Long cantidadPersonas;   // Cantidad de personas con esa cantidad de menores

    // Constructor
    public PersonaSituacionVulnerableDTO(Integer cantidadMenores, Long cantidadPersonas) {
        this.cantidadMenores = cantidadMenores;
        this.cantidadPersonas = cantidadPersonas;
    }

    // Getters y Setters
    public Integer getCantidadMenores() {
        return cantidadMenores;
    }

    public void setCantidadMenores(Integer cantidadMenores) {
        this.cantidadMenores = cantidadMenores;
    }

    public Long getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Long cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}

