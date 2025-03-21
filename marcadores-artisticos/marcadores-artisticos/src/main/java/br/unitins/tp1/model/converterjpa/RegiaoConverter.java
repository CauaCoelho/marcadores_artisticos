package br.unitins.tp1.model.converterjpa;

import br.unitins.tp1.model.TipoPonta;
import jakarta.persistence.AttributeConverter;


public class RegiaoConverter implements AttributeConverter <TipoPonta, Integer> {

    @Override
    public Integer convertToDatabaseColumn(TipoPonta regiao) {
        return regiao == null ? null : regiao.getId();
    }

    @Override
    public TipoPonta convertToEntityAttribute(Integer id) {
        return TipoPonta.valueOf(id);
    }
}
