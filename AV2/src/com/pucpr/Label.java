package com.pucpr;

public class Label implements Drawable{

    // Atributos
    public String texto;
    public int tamanhoFonte;

    // Constructor
    public Label(String texto, int tamanhoFonte) {
        this.texto = texto;
        this.tamanhoFonte = tamanhoFonte;
    }
    
    // Métodos
    public void onDraw(){
        //faz algo quando desenha
        
    }    





    // Gets and sets
    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getTamanhoFonte() {
        return this.tamanhoFonte;
    }

    public void setTamanhoFonte(int tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }

    
}
