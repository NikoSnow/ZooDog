/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sergioArboleda.facade;

import com.mycompany.jpa.Comentario;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.dao.ServiceImpl;
import edu.sergioArboleda.dao.SingletonConnection;
import java.util.List;
import javax.persistence.EntityManager;

public class ComentarioFacade extends ServiceImpl<Comentario> {
    public ComentarioFacade() throws ConexionException{
        super(Comentario.class);
    try{
             EntityManager em = SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
            e.printStackTrace();
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
    
    @Override
    public List<Comentario> findAll(){
        return super.findAll();
    }
    @Override
    public void save(Comentario coment){
        
    }
}
