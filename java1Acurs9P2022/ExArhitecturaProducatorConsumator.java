import java.util.*;
public class ExArhitecturaProducatorConsumator{
    public static List<Integer> list = new ArrayList<>();
    public static void main(String [] args){
        new Producator("P1").start();
        new Producator("P2").start();
        new Producator("P3").start();
        new Consumator("C1").start();
        new Consumator("C2").start();
        new Consumator("C3").start();
    }
}
