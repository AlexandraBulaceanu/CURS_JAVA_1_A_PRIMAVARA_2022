public class Dreptunghi extends Forma {
    int h;
    
    @Override
    public double getArie() {
        return l * h; //obligata sa suprasciu metoda abstracta din Forma
                      //daca decid sa las clasa Dreptughi concreta
    }
    //cls concreta = pot sa o instantiez = complet definita
    //cls abstracta = NU pot sa o instantiez = incomplet definita
}