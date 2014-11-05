/*
 * Waarneer.java
 */
package be.vdab.Getal;

import java.util.Arrays;
/**
 *
 * @author Andy.Mertens
 */
public class Waarnemer {
    
    private int minimumTemperatuur;
    private int maximumTemperatuur;
    private int [] gelezenTemperaturen;
    private long somGelezenTemperaturen ;
    private boolean flagEersteWaarde;
       
    public Waarnemer() {
        minimumTemperatuur=0;
        maximumTemperatuur=0;
        gelezenTemperaturen = new int[1];
        somGelezenTemperaturen=0;
        flagEersteWaarde = true;
      }
    
    public int getMinimumTemperatuur(){
        return minimumTemperatuur;
    }
    
    public int getMaximumTemperatuur(){
        return maximumTemperatuur;
    }
    
    public float gemiddeldeTemperatuur(){
        return (somGelezenTemperaturen/gelezenTemperaturen.length);
    }
    
    public void registreerTemperatuur(int temperatuur){
        if(temperatuur<minimumTemperatuur)
          minimumTemperatuur = temperatuur;
        if(temperatuur>maximumTemperatuur)
          maximumTemperatuur = temperatuur;
        if(flagEersteWaarde)
        {
            gelezenTemperaturen[0] = temperatuur;
            flagEersteWaarde = false;
        }
        else
        {
            int [] tempDynamischeTemperatuur = new int[gelezenTemperaturen.length+1];
            System.arraycopy(gelezenTemperaturen,0,tempDynamischeTemperatuur,0,gelezenTemperaturen.length);
            tempDynamischeTemperatuur[tempDynamischeTemperatuur.length-1] = temperatuur;
            gelezenTemperaturen = tempDynamischeTemperatuur;
            tempDynamischeTemperatuur = null;
        }
        somGelezenTemperaturen+= temperatuur;
    }
    
    public void PrintGeregistreerdeTemperaturen(){
        for(int i = 0 ; i <gelezenTemperaturen.length;i++ )
            System.out.println(gelezenTemperaturen[i]);
    }
     
}
