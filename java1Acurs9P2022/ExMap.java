import java.util.*;
public class ExMap {
    public static void main(String [] args) {
        Map<Integer,String> map = new HashMap<>(); //(LinkedHashMap, TreeMap)
        map.put(12,"Bucuresti");
        map.put(10,"Alexandria");
        map.put(20,"Brasov");
        map.put(8,"Constanta");
        map.put(10,"Timisoara");
        
        Set<Integer> keys = map.keySet();//setul de chei
        for(Integer k : keys) {
            System.out.println(k+" "+map.get(k));
        }
        
        System.out.println("=========");
        
        map.forEach((k,v) -> System.out.println(k+" "+v));
        
        System.out.println("=========");
        
        List<Integer> list1 = Arrays.asList(10,34,12,56);
        //J9
        List<Integer> list2 = List.of(10,34,12,56);//set,map -> max 10 elemente
        //J10
        var list3 = new ArrayList<Integer>();
        //list3 = new ArrayList<String>();
    }
}
