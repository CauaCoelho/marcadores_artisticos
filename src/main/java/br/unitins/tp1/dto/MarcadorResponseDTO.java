public record MarcadorResponseDTO(
    Long id,
    String marca,
    String modelo,
    TipoPonta tipoPonta)         {

        public static MarcadorResponseDTO valueOf(Marcador marcador){
            if (marcador == null){
                return null;
            }
            return new MarcadorResponseDTO(marcador.getId(),marcador.getMarca(), marcador.getModelo(), marcador.getTipoPonta());
        }
}