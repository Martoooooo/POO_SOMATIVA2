package com.pucpr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable{

    //Atributos
    ArrayList<GameObject> gameObject;

    //Métodos
    public Game(){
        gameObject = new ArrayList<>();
    }

    public void addObject(GameObject objeto) {
        //add item a lista (eu acho)
        gameObject.add(objeto);

    }

    public void removeObject(GameObject obj) {
    
        gameObject.remove(obj);
        
        System.out.println(gameObject);
    }

    public void drawAll(){
        for (GameObject obj : gameObject) {
            if(obj instanceof Label){
                ((Label) obj).onDraw();
            }
            if(obj instanceof Button){
                ((Button) obj).onDraw();
            }
            if(obj instanceof Circle){
                ((Circle)obj).onDraw();
            }
            if(obj instanceof Quad){
                ((Quad)obj).onDraw();
            }
        }

    }

    public void clickAll() {
        for (GameObject obj : gameObject) {
            if(obj instanceof Button){
                ((Button) obj).onClick();
            }
        }
    }

    public void LoadAll(){
       //info: limpa o array e carrega os objetos de um arquivo
        ObjectInputStream save = null;
        try{
            save = new ObjectInputStream(new FileInputStream("AV2/src/com/pucpr/saves/save.txt"));
            Object obj;
            while((obj = save.readObject())!=null){
                if(obj instanceof Button){
                    ((Button) obj).onClick();
                    ((Button) obj).onDraw();
                }
                if(obj instanceof Label){
                    ((Label)obj).onDraw();
                }
                if(obj instanceof Circle){
                    ((Circle)obj).onDraw();
                }
                if(obj instanceof Quad){
                    ((Quad) obj).onDraw();
                }
                
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não foi encontrado no método Load");
            //e.printStackTrace();
            
        } catch (IOException e) {   
            // e.printStackTrace();
            
        } catch (ClassNotFoundException e) {    
            // e.printStackTrace();
            
        } finally{
            if(save != null){
                try{
                    save.close();
                }catch(Exception e){    
                    
                }
            }
        }

    }

    public void SaveAll() {
        //info: salva os objetos em um arquivo

        ObjectOutputStream save = null;
        
        try{
            save = new ObjectOutputStream(new FileOutputStream("AV2/src/com/pucpr/saves/save.txt"));
            for (GameObject obj : gameObject) {
                save.writeObject(obj);
            }

            
        } catch (FileNotFoundException e){
            //e.printStackTrace();
            System.out.println("Arquivo não encontrado");
            
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Erro...");
        }finally{
            System.out.println("Arquivo salvo");
        }
    }

    
}
