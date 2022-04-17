import java.util.*;
public class ExPrime {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(3); //1
        list.add(7); //2
        list.add(20); //3
        list.add(9); //4
        list.add(2); //5
        
        int suma = 0;
        for(int i = 0; i < list.size(); i++) {
            int nrDivizori = 0;
            int nrCurent = list.get(i);
            for(int div = 2; div <= nrCurent/2; div++) {
                if(nrCurent % div == 0) {
                    nrDivizori++;
                }
            }
            if(nrDivizori == 0) {
                suma = suma + nrCurent;
            }
        }
        System.out.println("Suma nr prime este: "+suma);//12
        
        
        
        
        
        
        //col indexata, ordonata, permite duplicate
        
        System.out.println(list.size());//dimeniunea listei
        System.out.println(list.isEmpty());//lista goala sau nu
        System.out.println(list.get(2));//elem de la poz 2 => elem 7
        
        System.out.println("==============");
        //for clasic
        for(int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==============");
        //for tip 2
        for(Integer elem:list) {
            System.out.println(elem);
        }
        System.out.println("==============");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============");
        
        list.forEach(e -> System.out.println(e));//ex lambda de tip consumator
        
        System.out.println("==============");
        
        list.remove(2);//sterg o valoare de la un index
        list.remove(new Integer(2));//sterg efectiv valoarea data ca parametru
        
        System.out.println("==============");
        //:: => operator de referinta la metoda
        list.forEach(System.out::println);
        
    }
}