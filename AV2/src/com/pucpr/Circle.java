package com.pucpr;

public class Circle implements Drawable{
    
    //Atributos
    public float raio;

    //Constructor
    public Circle(float raio) {
        this.raio = raio;
    }

    //Métodos
    public void onDraw(){
        //faz algo quando desenha
        
    }

    //Getters and Setters
    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }


}
