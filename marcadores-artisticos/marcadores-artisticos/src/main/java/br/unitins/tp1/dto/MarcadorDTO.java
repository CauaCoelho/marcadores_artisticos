package br.unitins.tp1.dto;

public final class MarcadorDTO {

    private final String marca;
    private final String modelo;
    private final long tipoPonta;

    public MarcadorDTO(String marca, String modelo, long tipoPonta){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoPonta = tipoPonta;
    }

    public long getTipoPonta() {
        return tipoPonta;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
