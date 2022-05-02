import java.util.*;

public class Comanda{
    private static Comanda SINGLETON;
    
    private List<Pizza> pizza = new ArrayList<>();
    
    private Comanda(){
    }
    public List<Pizza> getPizza(){
        return pizza;//getter pt atributul privat
    }
    
    public static Comanda getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Comanda();
        }
        
        return SINGLETON;
    }
    
    public void adaugaPizza(Pizza p){
        pizza.add(p);
    }
    
    public void sorteaza(){        
        Collections.sort(pizza, 
            new Comparator<Pizza>(){
                @Override
                public int compare(Pizza p1, Pizza p2){
                    if(p1.pret < p2.pret) return -1;
                    if(p1.pret > p2.pret) return 1;
                    return 0;
                }
            }
        );
        
    }
    
    public void afisarePizza(){
        pizza.forEach(System.out::println);
    }
    
    public void afisareProsciuto(){
            for(Pizza p : pizza){
            if(p instanceof ProsciutoPizza){
                System.out.println(p);
            }
        }
       
    }
}