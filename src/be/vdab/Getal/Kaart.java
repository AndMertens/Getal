/*
 * Kaart.java
 */
package be.vdab.Getal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Andy.Mertens
 */
public class Kaart {
    
    public enum Kleur {
        
        HARTEN, RUITEN,KLAVEREN,SCHOPPEN;
    
        private static final List<Kleur> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Kleur randomKleur() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }
    
    public enum Rang {
        EEN,TWEE,DRIE,VIER,VIJF,ZES,ZEVEN,ACHT,NEGEN,TIEN,BOER,VROUW,HEER,AAS;
        
        private static final List<Rang> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Rang randomRang() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }
       
    private final Kleur kaartKleur;
    private final Rang kaartRang;
    
    public Kaart(){
        kaartKleur = Kleur.randomKleur();
        kaartRang = Rang.randomRang();
    }
    
    public String printKaart(){
        return (kaartKleur.toString() + " "  + kaartRang.toString());
    }
    
    public boolean IshogerDan(Kaart andereKaart){
       return( this.kaartKleur.compareTo(andereKaart.kaartKleur)>= 0 && 
                this.kaartRang.compareTo(andereKaart.kaartRang)> 0 );
    }
}