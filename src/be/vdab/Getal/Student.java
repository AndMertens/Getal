/*
 * Student.java
 */
package be.vdab.Getal;

/**
 *
 * @author Andy.Mertens
 */
public class Student {
    
    private int score;
    private String naam;
    
    public int getScore(){
        return score;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public Student(String Naam){
        naam=Naam;
        score=0;
    }
    
    public Student(String Naam, int Score){
        naam=Naam;
        score= Score;
    }
}
