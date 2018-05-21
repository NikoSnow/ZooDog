/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamuntorest;

import com.mycompany.jpa.Dog;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.facade.DogFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.model.DogDTO;

@Path("/dog")
public class DogService {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<DogDTO> getDog_JSON() throws ConexionException {
        List<DogDTO> dogdto = new ArrayList<DogDTO>();
        DogFacade facade = null;

        facade = new DogFacade();
        List<Dog> dogs = facade.findAll();
        for (Dog dog : dogs) {
            DogDTO ddto = new DogDTO();
            ddto.setIdDog(dog.getIdDog());
            ddto.setRaza(dog.getRaza());
            ddto.setGrupo(dog.getGrupo());
            ddto.setPersonalidad(dog.getPersonalidad());
            ddto.setEnergia(dog.getEnergia());
            ddto.setDescripcion(dog.getDescripcion());
            dogdto.add(ddto);
        }

        return dogdto;
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public DogDTO getPerro(@PathParam("id") String id) throws ConexionException{
        DogFacade facade = null;
        DogDTO ddto = null;
        
        facade=new DogFacade();
        Dog perro=facade.get(Integer.parseInt(id));
        ddto = new DogDTO();
        ddto.setIdDog(perro.getIdDog());
        ddto.setRaza(perro.getRaza());
        ddto.setGrupo(perro.getGrupo());
        ddto.setPersonalidad(perro.getPersonalidad());
        ddto.setEnergia(perro.getEnergia());
        ddto.setDescripcion(perro.getDescripcion());
        
        return ddto;
    }
}
