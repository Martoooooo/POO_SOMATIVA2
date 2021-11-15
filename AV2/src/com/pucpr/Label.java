package com.pucpr;
                //seguindo o diagrama, acho
                //que tem que ter esse extend
public class Label extends GUI{

    // Atributos
    public String texto;
    public int tamanhoFonte;

    // Constructor
    public Label(float posicaoX, float posicaoY,
                String texto, int tamanhoFonte){ 
                super(posicaoX, posicaoY);
                
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
