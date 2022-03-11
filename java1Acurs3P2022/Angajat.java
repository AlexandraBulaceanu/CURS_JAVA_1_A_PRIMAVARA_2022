public class Angajat {
    int id;
    String nume;
    double salariu;
    int varsta;
    int nivelFunctie;
    static String companie;
    static int nrAngajati;
    
    public Angajat(String nume, double salariu, int varsta, int nivelFunctie) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.nivelFunctie = nivelFunctie;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    public Angajat(String nume,int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    public Angajat(String nume, double salariu, int varsta) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    public Angajat() {
        this("Ana",4567.8,24);
    }
    
    static void afiseazaAngajati() {
        System.out.println(Angajat.nrAngajati);
        //System.out.println(this.nume);
    }
    
    //metoda comportament(non-statica) 
    //-> calculeaza (si intoarce) diferenta de varsta dintre doi angajati
    int diferentaVarsta(Angajat a) {
        int dif;
        if (this.varsta > a.varsta) {
            dif = this.varsta - a.varsta;
                //a1.varsta     //a2.varsta 
        } else {
            dif = a.varsta - this.varsta;
        }
        return dif;
    }
}