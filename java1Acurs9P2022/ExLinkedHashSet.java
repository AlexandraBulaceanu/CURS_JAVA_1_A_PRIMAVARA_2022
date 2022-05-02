import java.util.*;
public class ExLinkedHashSet{
    public static void main(String [] args){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(45);
        set.add(26);
        set.add(45);
        set.add(10);
        set.forEach(System.out::println);
    }
}
