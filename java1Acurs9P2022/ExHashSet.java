import java.util.*;
public class ExHashSet{
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(45);
        set.add(26);
        set.add(45);
        set.add(10);
        set.forEach(System.out::println);
    }
}

