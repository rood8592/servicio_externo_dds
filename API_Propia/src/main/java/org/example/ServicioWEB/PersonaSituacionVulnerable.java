package org.example.ServicioWEB;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "personasituacionvulnerable", schema = "ddstp")
public class PersonaSituacionVulnerable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidadMenoresACargo")
    private Integer cantidadMenoresACargo;

    @Column(name = "enSituacionCalle")
    private Integer enSituacionCalle;

    @Column(name = "fechaRegistroSistema")
    private LocalDateTime fechaRegistroSistema;

    @Column(name = "poseeMenoresACargo")
    private Integer poseeMenoresACargo;


    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadMenoresACargo() {
        return cantidadMenoresACargo;
    }

    public void setCantidadMenoresACargo(Integer cantidadMenoresACargo) {
        this.cantidadMenoresACargo = cantidadMenoresACargo;
    }

    public Integer getEnSituacionCalle() {
        return enSituacionCalle;
    }

    public void setEnSituacionCalle(Integer enSituacionCalle) {
        this.enSituacionCalle = enSituacionCalle;
    }

    public LocalDateTime getFechaRegistroSistema() {
        return fechaRegistroSistema;
    }

    public void setFechaRegistroSistema(LocalDateTime fechaRegistroSistema) {
        this.fechaRegistroSistema = fechaRegistroSistema;
    }

    public Integer getPoseeMenoresACargo() {
        return poseeMenoresACargo;
    }

    public void setPoseeMenoresACargo(Integer poseeMenoresACargo) {
        this.poseeMenoresACargo = poseeMenoresACargo;
    }

}

