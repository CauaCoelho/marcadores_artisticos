package br.unitins.tp1.model;

import jakarta.persistence.*;

@Entity
public class Marcador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60, nullable = false)
    private String marca;

    @Column(length = 2, nullable = false)
    private String modelo;

    private TipoPonta tipoPonta;

    public TipoPonta getTipoPonta() {
        return tipoPonta;
    }

    public void setTipoPonta(TipoPonta regiao) {
        this.tipoPonta = regiao;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
