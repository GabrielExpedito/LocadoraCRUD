package LocadoraCRUD.lib.entity;

public class Modelo {
    
    private int id;
    private String nome;
    private int idfabricante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }

    public Modelo() {
    }

    public Modelo(int id, String nome, int idfabricante) {
        this.id = id;
        this.nome = nome;
        this.idfabricante = idfabricante;
    }
    
    
    
    
    
    
    
}
