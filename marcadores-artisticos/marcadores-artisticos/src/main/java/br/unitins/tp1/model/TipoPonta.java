package br.unitins.tp1.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoPonta {
    CENTRO_OESTE(1, "Centro-Oeste"),
    NORTE(2, "Norte"),
    NORDESTE(3, "Nordeste"),
    SUDESTE(4, "Sudeste"),
    SUL(5, "Sul");

    private final int ID;
    private final String NOME;

    private TipoPonta(int id, String nome){
        this.ID = id;
        this.NOME = nome;
    }

    public int getId() {
        return ID;
    }

    public String getNome() {
        return NOME;
    }

    public static TipoPonta valueOf(int id){
        for (TipoPonta r : TipoPonta.values()){
            if (r.getId() == id)
                return r;
        }
                return null;
    }
}
