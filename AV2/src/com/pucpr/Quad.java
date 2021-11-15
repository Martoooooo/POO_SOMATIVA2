package com.pucpr;
                //seguindo o diagrama, acho
                //que tem que ter esse extend
public class Quad extends PrimitiveObject{
    
    //Atributos
    public float largura, altura;

    //Constructor
    public Quad(float posicaoX, float posicaoY, 
                float largura, float altura){
                
                //String nome){ //O exemplo não pede nome, mas não consigo tirar
                super(posicaoX, posicaoY);
        
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
