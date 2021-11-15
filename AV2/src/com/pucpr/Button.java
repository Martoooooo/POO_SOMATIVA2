package com.pucpr;
                //seguindo o diagrama, acho
                //que tem que ter esse extend
public class Button extends GUI implements Clickable{

    // Atributos
    public String texto;

    // Constructor
    public Button(float posicaoX, float posicaoY,
                String texto) {
                super(posicaoX, posicaoY);
                
        this.texto = texto;
    }

    //Métodos
    public void onDraw(){
        //faz algo quando desenha
        
    }
    public void onClick(){
        //faz algo quando clica
        
    }


    // Gets and sets
    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }




    
}
