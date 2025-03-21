package br.unitins.tp1.repository;


import br.unitins.tp1.model.Marcador;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MarcadorRepository implements PanacheRepository<Marcador> {

    public Marcador findByModelo (String modelo) {
        return find("SELECT m FROM Marcador m  WHERE e.modelo = ?1 ", modelo).firstResult();

    }
}
