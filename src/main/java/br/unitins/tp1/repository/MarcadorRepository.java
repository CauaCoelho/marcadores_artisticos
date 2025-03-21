import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MarcadorRepository implements PanacheRepository<Marcador>{

    public Marcador findByModelo(String modelo){
        return find("SELECT = FROM Marcador e WHERE e.modelo = ?1", modelo).firstResult();
    }
}