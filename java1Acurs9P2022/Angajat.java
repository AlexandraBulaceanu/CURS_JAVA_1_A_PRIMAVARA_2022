public class Angajat implements Comparable<Angajat> {
    String nume;
    int varsta;
    
    public Angajat(String nume,int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
  
    @Override
    public int compareTo(Angajat a) {
        return this.varsta - a.varsta;
    }
    
    public String toString(){
        return "nume "+nume+" varsta "+varsta;
    }
}
