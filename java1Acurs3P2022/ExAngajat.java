public class ExAngajat {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Ion",23500,35,2);
        Angajat a2 = new Angajat("Pop",73500,45,3);
        
        a1.companie = "Facebook";
        a2.companie = "Google";
        Angajat.companie = "Meta";//standardul de dereferentiere pt static
        
        a1.nume = "Popescu";
        
        System.out.println(a1.nume+" "+a1.id+" "+a1.companie);
        System.out.println(a2.nume+" "+a2.id+" "+a2.companie);
        System.out.println(Angajat.companie);
        
        System.out.println(Angajat.nrAngajati);
        
        Angajat.afiseazaAngajati();
        
        int dif = a1.diferentaVarsta(a2);
        //a1.diferenta(a1,a2)
        System.out.println(dif);
        
        Angajat a3 = new Angajat();
        System.out.println(a3.nume+" "+a3.id+" "+
                            a3.companie+" "+a3.varsta+" "+a3.salariu+" "+a3.nivelFunctie);
    }
}