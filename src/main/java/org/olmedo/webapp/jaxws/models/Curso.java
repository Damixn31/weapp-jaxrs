package org.olmedo.webapp.jaxws.models;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement //solamente para XML para que se pueda convertir
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

   // @XmlTransient // con esto el instructor no se envia en el xml se genera el xml pero sin el instructor
    private String instructor;
    private Double duracion;

    public Curso() {

    }

    public Curso(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
}
