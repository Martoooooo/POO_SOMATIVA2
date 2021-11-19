package com.pucpr;

public class Main {

    public static void main(String[] args) {
   // write your code here
        Game game = new Game();
        Quad a = new Quad(32,12,5,5);
        game.addObject(a);
        
        Circle b = new Circle(4,4,3);
        game.addObject(b);
        
        Label c = new Label(0,0,"Nome do jogo",12);
        game.addObject(c);
        
        Quad d = new Quad(32,12,5,5);
        game.addObject(d);
        
        Quad e = new Quad(32,12,5,5);
        game.addObject(e);
        
        game.addObject(new Button(0,0,"Iniciar"));
        
        //game.clickAll();
        //game.drawAll();
        // game.SaveAll();
        game.LoadAll();
        // game.removeObject(a);
        
    
    }
}