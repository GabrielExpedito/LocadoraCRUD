package LocadoraCRUD.lib.entity;

public class Carro {
    private int id;
    private int idfabricante;
    private int idmodelo;
    private String placa;
    private String cor;
    private Boolean disponivel;
    private int ano;
    private Double valorlocacao;

    public Carro() {
    }

    public Carro(int id, int idfabricante, int idmodelo, String placa, String cor, Boolean disponivel, int ano, Double valorlocacao) {
        this.id = id;
        this.idfabricante = idfabricante;
        this.idmodelo = idmodelo;
        this.placa = placa;
        this.cor = cor;
        this.disponivel = disponivel;
        this.ano = ano;
        this.valorlocacao = valorlocacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }

    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorlocacao() {
        return valorlocacao;
    }

    public void setValorlocacao(Double valorlocacao) {
        this.valorlocacao = valorlocacao;
    }
    
    
    
    
}
