/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aydin.demoapp1215pm;

/**
 *
 * @author ilknur aydin
 */
public class Player {
    // private fields
    private String name;
    private int score;
    
    // constructor with parameters
    public Player(String theName, int theScore){
        name = theName;
        score = theScore;
    }
    
    // getters
    
    // setters
    
    // toString method
    public String toString(){
        return "name: " + name + " score: " + score;
    }
    
}
