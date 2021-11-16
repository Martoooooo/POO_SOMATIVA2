package com.pucpr;
                //seguindo o diagrama, acho
                //que tem que ter esse extend
public class Circle extends PrimitiveObject{
    
    //Atributos
    public float raio;

    //Constructor
    public Circle(float posicaoX, float posicaoY,
                float raio) {//O exemplo não pede nome, mas não consigo tirar
                    
                super(posicaoX, posicaoY);

                
        this.raio = raio;
    }

    //Métodos
    public void onDraw(){
        //faz algo quando desenha
        System.out.println("🔴 Desenha um circulo na posição \nx: "+posicaoX+
                            "\ny: "+posicaoY+"\nRaio: "+raio);
        
    }

    //Getters and Setters
    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }


}
