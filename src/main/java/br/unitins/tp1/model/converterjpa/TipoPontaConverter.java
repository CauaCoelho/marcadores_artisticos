@Converter(autoApply = true)
public class TipoPontaConverter implements AttributeConverter<TipoPonta, Integer>{

    @Override
    public Integer convertToDatabaseColumn(TipoPonta tipoPonta){
        return tipoPonta == null ? null:modelos.getId();

    }

    @Override
    public TipoPonta convertToEntityAttribute(Integer id){
        return TipoPonta.valueOf(id);
    }
}
