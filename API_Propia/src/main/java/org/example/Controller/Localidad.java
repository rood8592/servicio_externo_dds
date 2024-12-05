package org.example.Controller;

import javax.persistence.*;
import java.util.List;

@Entity
public class Localidad {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    String nombre;


    public Localidad() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}