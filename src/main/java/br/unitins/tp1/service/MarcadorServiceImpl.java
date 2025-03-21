@ApplicationScoped
public class MarcadorServiceImpl implements MarcadorService{

    @Inject
    MarcadorRepository marcadorRepository;

    @Override
    @Transactional
    public Marcador create(MarcadorDTO marcador){
        Marcador novoMarcador = new Marcador();
        novoMarcador.setModelo(marcador.getModelo);
        novoMarcador.setTipoPonta(marcador.getTipoPonta());

        Marcador marcador = null;
        for (Marcador x : Marcador.values()){
            if (x.getId() == marcador.getIdMarcador())
            marcador = x;
        }

        novoMarcador.setMarcador(marcador);

        marcadorRepository.persist(novoMarcador);

        return novoMarcador;
    
    }

    @Override
    @Transactional
    public void update(long id, Marcador marcador) {
        Marcador edicaoMarcador = marcadorRepository.findById(id);

        edicaoMarcador.setNome(marcador.getModelo());
        edicaoMarcador.setNome(marcador.getTipoPonta());
    }

    @Override
    @Transactional
    public void delete(long id){
        marcadorRepository.deleteById(id);
    }

    @Override
    public Marcador findById(long id){
        return marcadorRepository.findById(id);
    }

    @Override
    public Marcador findByModelo(String modelo){
        return marcadorRepository.findByModelo(modelo);
    }

    @Override
    public List<Marcador> findAll(){
        return marcadorRepository.findAll().list();
    }
}