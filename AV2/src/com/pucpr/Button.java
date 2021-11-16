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
        System.out.println("🔘 Desenha um botão na posição \nx:"+posicaoX+
                            "\ny: "+posicaoY+"\nTitulo: "+texto);
    }
    public void onClick(){
        //faz algo quando clica
        System.out.println("Clicou no botão: "+texto);
        
    }


    // Gets and sets
    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }




    
}
