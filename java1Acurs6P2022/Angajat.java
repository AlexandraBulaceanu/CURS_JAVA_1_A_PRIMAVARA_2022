public class Angajat {
    String nume;
    double salariu;
    int vechime;
    
    public Angajat(String nume, double salariu, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechime = vechime;
    }
    
    public double determinaSalariu() {
        if(this.vechime >= 4) {
            this.salariu = this.salariu + 0.1*this.salariu;
        }
        return this.salariu;
    }
}