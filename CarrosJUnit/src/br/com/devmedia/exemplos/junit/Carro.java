package br.com.devmedia.exemplos.junit;

import java.time.LocalDate;

public class Carro {

    private String modelo;
    private String marca;
    private int anoLancamento;
    private LocalDate dataAquisicao;

    public Carro(String modelo, String marca, int anoLancamento, LocalDate dataAquisicao) {
        super();

        if (anoLancamento > dataAquisicao.getYear()) {
            throw new IllegalArgumentException("Ano de lancamento nao pode ser maior que o ano de aquisicao do carro.");
        }

        this.modelo = modelo;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.dataAquisicao = dataAquisicao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

}