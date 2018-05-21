/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sergioArboleda.facade;

import com.mycompany.jpa.Dog;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.dao.ServiceImpl;
import edu.sergioArboleda.dao.SingletonConnection;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Nicolas
 */
public class DogFacade extends ServiceImpl<Dog> {
    public DogFacade() throws ConexionException {
        super(Dog.class);
        try{
             EntityManager em = SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
            e.printStackTrace();
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
    
    @Override
    public List<Dog> findAll(){
        return super.findAll();
    }
    public List<Dog> findByProperty(String prop,Dog dog){
        return super.findByProperty(prop, dog);
    }
    
   
}
