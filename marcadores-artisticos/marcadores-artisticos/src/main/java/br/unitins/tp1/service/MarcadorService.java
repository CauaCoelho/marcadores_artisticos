package br.unitins.tp1.service;

import br.unitins.tp1.dto.MarcadorDTO;
import br.unitins.tp1.model.Marcador;

import java.util.List;

public interface MarcadorService {

    Marcador create(MarcadorDTO marcador);
    void update(long id, Marcador marcador);
    void delete(long id);
    Marcador findById(long id);
    Marcador findByModelo(String modelo);
    List<Marcador> findAll();
}
