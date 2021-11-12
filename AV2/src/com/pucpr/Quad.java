package com.pucpr;

public class Quad implements Drawable{
    
    //Atributos
    public float largura, altura;

    //Constructor
    public Quad(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //Métodos
    public void onDraw(){
        //faz algo quando desenha
        
    }

    //Getters and Setters
    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
