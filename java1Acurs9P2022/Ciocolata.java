public class Ciocolata extends Produs {
    int kcal;
    
    @Override
    public String toString() {
        return "Cioco "+this.nume+" "+this.pret+" "+this.kcal;
    }
}