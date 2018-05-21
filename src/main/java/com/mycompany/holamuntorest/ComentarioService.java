/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamuntorest;

/**
 *
 * @author @author Nicolas
 */
import com.mycompany.jpa.Comentario;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.facade.ComentarioFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.model.ComentarioDTO;

@Path("/comentario")
public class ComentarioService {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    
    public List<ComentarioDTO> getComentario_JSON() throws ConexionException{
        List<ComentarioDTO> comdto = new ArrayList<ComentarioDTO>();
        ComentarioFacade facade = null;
        facade = new ComentarioFacade();
        List<Comentario> comentarios= facade.findAll();
        for(Comentario comentario: comentarios){
            ComentarioDTO cdto = new ComentarioDTO();
            cdto.setIdComentario(comentario.getIdComentario());
            cdto.setFecha(comentario.getFecha());
            cdto.setComentario(comentario.getComentario());
            cdto.setUsuario(comentario.getUsuario());
            comdto.add(cdto);
        }
        return comdto;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public ComentarioDTO addComentario(ComentarioDTO comentario) throws ConexionException{
        ComentarioFacade facade = null;
        ComentarioDTO cdto =null;
        
        facade = new ComentarioFacade();
        Comentario comentarioJPA = new Comentario();
        comentarioJPA.setIdComentario(comentario.getIdComentario());
        comentarioJPA.setFecha(comentario.getFecha());
        comentarioJPA.setComentario(comentario.getComentario());
        comentarioJPA.setUsuario(comentario.getUsuario());
        facade.save(comentarioJPA);
        return cdto;
        }
}
