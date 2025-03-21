package br.unitins.tp1.resource;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List; 
import br.unitins.tp1.model.Marcador;

@Path("marcadores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MarcadorResource {

    @Inject
    MarcadorService service;

    @GET
    public List<Marcador> buscarMarcadores(){
        return service.findAll();
    }

    @GET
    @Path{"/tipo/{tipo}"}
    public Marcador buscarPorModelo(String modelo){
        return service.findByModelo(modelo);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Marcador incluir(MarcadorDTO dto){
        return service.create(dto);
    }

    @PUT
    @Path("{id}")
    public void alterar(Marcador marcador, Long id){
        service.update(id, marcador);

    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void apagar (Long id){
       service.delete(id);
    }
}

