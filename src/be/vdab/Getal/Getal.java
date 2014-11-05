/*
 * Getal.java
 */
package be.vdab.Getal;

/**
 *
 * @author Andy.Mertens
 */
public class Getal {
    
    private int X;
    
    public int getX(){
        return X;
    }
    
    public void voegToe(int a){
        X+= a;
    }
    
    public Getal(int a){
        X=a;
    }
    
    public void Print(){
        System.out.println(X);
    }
    
    public int absoluut(){
        return Math.abs(X);
    }
    
    public int som(int a){
        return (X + a);
    }
    
    public float som(float a){
        return X+a;
    }
    
    public double som (double a){
        return X+a;
    }
    
    public double toDouble(){
        return (double)X;
    }
    
}
