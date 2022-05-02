/**
   Aplicatie pentru o pizzerie
   
   O pizza are un pret si o marime(enumerare cu valori de mica, medie si mare).
   Exista doua tipuri de pizza: Prosciuto si Funghi.
   La un moment dat, poate fi administrata o singura comanda, ce poate contine mai multe pizza.
   Se dau mai multe comenzi din consola, ce se considera corecte.
   exit - iesire din program
   adaugaPizza tip_pizza(p pt prosciuto sau f pt funghi) pret marimea
   sortare -dupa pret
   afisare -afiseaza tot ce am in comanda
   afisareProsciuto afisare pizza prosciuto
   In paralel, va rula un fir de executie ce afiseaza dimensiunea listei de pizza la fiecare minut.
   
*/

import java.util.*;

public class Main{
    public static void main(String [] args){
        
        SizeThread r = new SizeThread();
        Thread t= new Thread(r);
        t.start();
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.print("Comanda: ");
            String cmd = s.nextLine();
            
            String [] v= cmd.split("\\s+");
            
            switch(v[0]){
                case "exit":
                    System.out.println("Se inchide...");
                    return;
                case "ap":
                    Pizza p;
                    if("p".equalsIgnoreCase(v[1])){
                        p = new ProsciutoPizza();
                    } else{
                        p = new FunghiPizza();
                    }
                    p.pret = Double.parseDouble(v[2]);
                    
                    switch(v[3]){
                       case "mica":  p.marime  =  Marime.MIC; break;
                       case "mare":  p.marime  =  Marime.MARE; break;
                       case "medie": p.marime  =  Marime.MEDIU; break;
                    }
                    
                    Comanda.getInstance().adaugaPizza(p);
                    System.out.println("Pizza a fost adaugata!");
                break;
                
                case "afisare": 
                    Comanda.getInstance().afisarePizza();
                    break;
                case "sorteaza":
                    Comanda.getInstance().sorteaza();
                    Comanda.getInstance().afisarePizza();
                    break;
               case "afisare_prosciuto": Comanda.getInstance().afisareProsciuto();
                                         break;
            }
        }
    }
}