package com.sabornabrasa.builder;

public class Hamburguer {

    private String pao;
    private String carne;
    private String queijo;
    private boolean bacon;
    private boolean salada;
    private String molho;

    public Hamburguer() {
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isSalada() {
        return salada;
    }

    public void setSalada(boolean salada) {
        this.salada = salada;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", queijo='" + queijo + '\'' +
                ", bacon=" + bacon +
                ", salada=" + salada +
                ", molho='" + molho + '\'' +
                '}';
    }
}