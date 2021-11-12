package com.pucpr;

public class Button implements Clickable, Drawable {

    // Atributos
    public String texto;

    // Constructor
    public Button(String texto) {
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
