import java.util.*;
public class Magazin {
    
    //lista de produse
    private List<Produs> produse = new ArrayList<>();
    
    //singleton
    private static Magazin instance;
    
    private Magazin() {}
    
    public static Magazin getInstance() {
        if(instance == null) {
            instance = new Magazin();
        }
        return instance;
    }
    
    //met pentru adaugare
    public void adaugaProdus(Produs p) {
        if(produse.size() < 20) {
            produse.add(p);
        } else {
            throw new PreaMulteProduseException();
        }
    }
    
    //met pt afisare
    public void afisareProduse() {
        produse.forEach(System.out::println);
    }
    
    //met pt afisare doar produse de tip ciocolata
    public void afisareCiocolata() {
        for(Produs p : produse) {
            if(p instanceof Ciocolata) {
                System.out.println(p);
            }
        }
    }
    
    //met pentru stergere
    public void sterge(String nume) {
        for(int i=0;i<produse.size();i++) {
            if(produse.get(i).nume.equals(nume)) {
                produse.remove(produse.get(i)); //produse.remove(i)
            }
        }
    }
    
    
}