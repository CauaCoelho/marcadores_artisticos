package br.unitins.tp1.model;

import jakarta.persistence.Entity;

@Entity
public class Marcador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id

    @Column(length = 60, nullable = false)
    private String marca;

    @Column(length = 20, nullable = false)
    private String modelo;
    private TipoPonta tipoPonta;
     
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
    
    public TipoPonta getTipoPonta(TipoPonta tipoPonta){
        return tipoPonta;
    }

    public this.tipoPonta = tipoPonta;
    
}
