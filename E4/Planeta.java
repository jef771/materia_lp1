/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */

public class Planeta {
    
    private String nome;
    private int temperatura;
    private double velocidade;
    private long massa;
    private boolean cinturao;
    private int numeroDeLuas;

    public Planeta(String nome, int temperatura, double velocidade, long massa, boolean cinturao, int numeroDeLuas) {
        this.nome = nome;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.massa = massa;
        this.cinturao = cinturao;
        this.numeroDeLuas = numeroDeLuas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setMassa(long massa) {
        this.massa = massa;
    }

    public void setCinturao(boolean cinturao) {
        this.cinturao = cinturao;
    }

    public void setNumeroDeLuas(int numeroDeLuas) {
        this.numeroDeLuas = numeroDeLuas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public long getMassa() {
        return this.massa;
    }

    public boolean getCinturao() {
        return this.cinturao;
    }

    public int getNumeroDeLuas() {
        return this.numeroDeLuas;
    }

}
