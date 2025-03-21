public interface MarcadorService {

    Marcador create(MarcadorDTO marcador);
    void update(long id, Marcador marcador);
    void delete(long id);
    Marcador findById(long id);
    Marcador findByModelo(String modelo);
    List<Marcador> findAll();
}