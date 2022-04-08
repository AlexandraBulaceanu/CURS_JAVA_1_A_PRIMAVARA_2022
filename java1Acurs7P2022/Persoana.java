public class Persoana {
    String nume;
    int varsta;
    String ocupatie;
    
    Persoana(String nume, int varsta, String ocupatie) {
        this.nume = nume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
    }
    
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(o instanceof Persoana) {
            Persoana p = (Persoana)o;
            return this.varsta == p.varsta; //cele doua instante care se compara sunt this si p
            //definesc regula de egalitate dintre cele doua instante
            //p1.varsta == p2.varsta
        }
        return false;
    }
    
    public String toString() {
        return "Nume: "+this.nume+" Varsta: "+this.varsta+" Ocupatia: "+this.ocupatie;
    }
}