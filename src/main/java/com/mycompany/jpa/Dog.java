
package com.mycompany.jpa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Dog")
public class Dog implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDog;
    
    @Column(name="raza")
    private String raza;
    
    @Column(name="grupo")
    private String grupo;
    
    @Column(name="personalidad")
    private String personalidad;
    
    @Column(name="energia")
    private String energia;
    
    @Column (name="descripcion")
    private String descripcion;

    public Integer getIdDog() {
        return idDog;
    }

    public void setIdDog(Integer idDog) {
        this.idDog = idDog;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Dog{" + "idDog=" + idDog + ", raza=" + raza + ", grupo=" + grupo + ", personalidad=" + personalidad + ", energia=" + energia + ", descripcion=" + descripcion + '}';
    }
    
    

    
    
    
    
}
