public abstract class Produs {
    String nume;
    double pret;
    
    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(o instanceof Produs) {
            Produs p = (Produs)o;
            return this.nume.equals(p.nume);
        }
        return false; 
    }
}