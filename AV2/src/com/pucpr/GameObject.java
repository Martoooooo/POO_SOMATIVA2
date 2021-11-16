package com.pucpr;

import java.io.Serializable;

public abstract class GameObject implements Serializable {
    
    //Atributos
    public String nome;
    public float posicaoX, posicaoY;

    //Constructor
    public GameObject(String nome, float posicaoX, float posicaoY) {
        this.nome = nome;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public GameObject(float posicaoX, float posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY= posicaoY;
    }


    //Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPosicaoX() {
        return this.posicaoX;
    }

    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }

    public float getPosicaoY() {
        return this.posicaoY;
    }

    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }

}
