package br.unitins.tp1.service;

import br.unitins.tp1.dto.MarcadorDTO;
import br.unitins.tp1.model.Marcador;
import br.unitins.tp1.model.TipoPonta;
import br.unitins.tp1.repository.MarcadorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class MarcadorServiceImpl implements MarcadorService{

    @Inject
    MarcadorRepository marcadorRepository;

    @Override
    @Transactional
    public Marcador create(MarcadorDTO marcador) {
        Marcador novoMarcador = new Marcador();
        novoMarcador.setMarca(marcador.getMarca());
        novoMarcador.setModelo(marcador.getModelo());

        for (TipoPonta t : TipoPonta.values()){
            if (t.getId() == marcador.getTipoPonta()) {
            }
        }
        marcadorRepository.persist(novoMarcador);

        return novoMarcador;
    }

    @Override
    @Transactional
    public void update(long id, Marcador marcador) {
        Marcador edicaoMarcador = marcadorRepository.findById(id);

        edicaoMarcador.setMarca(marcador.getMarca());
        edicaoMarcador.setModelo(marcador.getModelo());
    }

    @Override
    @Transactional
    public void delete(long id) {
        marcadorRepository.deleteById(id);
    }

    @Override
    public Marcador findById(long id) {
        return marcadorRepository.findById(id);
    }

    @Override
    public Marcador findByModelo(String modelo) {
        return marcadorRepository.findByModelo(modelo);
    }

    @Override
    public List<Marcador> findAll() {
        return marcadorRepository.findAll().list();
    }
}
