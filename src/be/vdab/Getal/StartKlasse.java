/*
 * SpeelMetGetal (Main class)
 */
package be.vdab.Getal;

import java.util.*;

/**
 *
 * @author Andy.Mertens
 */
public class StartKlasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OEFENING Hoofdstuk 5 : KLASSE GETAL
        /*
        Getal getal1 = new Getal(10);
        System.out.println("De absolute waarde van " + getal1.getX() + " is : " + getal1.absoluut());
        System.out.println("De som van " + getal1.getX() + " met -20 is : " + getal1.som(-20));
        getal1.voegToe(-25);
        System.out.println("Getal 1 - 25 is : " + getal1.getX());
        System.out.println("De som van " + getal1.getX() + " met 2.5 is : " + getal1.som(2.5F));
        System.out.println("De som van " + getal1.getX() + " met 2.5 is : " + getal1.som(2.5D));
        System.out.println("De som van " + getal1.getX() + " met 2.5 is : " + getal1.som(2.5D));
        System.out.println("de duble waarde van getal 1 is : " + getal1.toDouble());
        */
        
        //OEFENING Hoofdstuk 5 : KLASSE WAARNEMER
        /*int leesTemperatuur = 0;
        Waarnemer temperatuurStatistieken = new Waarnemer();                
        System.out.println("Geef de temperatuur in (999 om te stoppen):");
        Scanner sc = new Scanner(System.in);
        leesTemperatuur = sc.nextInt();
        while(leesTemperatuur!=999){
            temperatuurStatistieken.registreerTemperatuur(leesTemperatuur);
            System.out.println("Geef de temperatuur in (999 om te stoppen): ");
            leesTemperatuur = sc.nextInt();
        }
        temperatuurStatistieken.PrintGeregistreerdeTemperaturen();
        System.out.println("Minimum temperatuur is : " + temperatuurStatistieken.getMinimumTemperatuur());
        System.out.println("Maximum temperatuur is : " + temperatuurStatistieken.getMaximumTemperatuur());
        System.out.println("Gemiddelde temperatuur is : " + temperatuurStatistieken.gemiddeldeTemperatuur());
        */
        
        //OEFENING Hoofdstuk 5 : KLASSE STUDENT
        /*
        Student student1 = new Student("Andy",8);
        Student student2 = new Student("Rik");
        System.out.println("Eerste student : \t" + student1.getNaam() + "\t" + student1.getScore());
        System.out.println("Tweede student : \t" + student2.getNaam() + "\t" + student2.getScore());
        */
        
        //OEFENING Hoofdstuk 5 : KLASSE KAART
       /* Kaart kaart1 = new Kaart();
        System.out.println("Kaart 1 is : " + kaart1.printKaart());
         
        Kaart kaart2=new Kaart();
        System.out.println("Kaart 2 is : " + kaart2.printKaart());
        if(kaart1.IshogerDan(kaart2))
            System.out.println(kaart1.printKaart() + " is hoger dan " +  kaart2.printKaart());
        else
            System.out.println(kaart1.printKaart() + " is niet hoger dan " + kaart2.printKaart());
        */
        
        //OEFENING Hoofdstuk 6 : INHERITANCE
        
    }       
}
