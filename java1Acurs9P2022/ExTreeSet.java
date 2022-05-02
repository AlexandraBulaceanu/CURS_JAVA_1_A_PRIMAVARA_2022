import java.util.*;
public class ExTreeSet {
    public static void main(String [] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(20);
        set.forEach(System.out::println);
        
        Comparator<Angajat> c = new Comparator<>(){
            public int compare(Angajat a1, Angajat a2) {
                return a1.nume.compareTo(a2.nume);
            }
        };
        
        Set<Angajat> set1 = new TreeSet<>();
        set1.add(new Angajat("Horia",43));
        set1.add(new Angajat("Tudor",34));
        set1.add(new Angajat("Daria",52));
        set1.add(new Angajat("Elena",20));
        
        Set<Angajat> set2 = new TreeSet<>(c);
        set2.add(new Angajat("Horia",43));
        set2.add(new Angajat("Tudor",34));
        set2.add(new Angajat("Daria",52));
        set2.add(new Angajat("Elena",20));
        
        Set<Angajat> set3 = new TreeSet<>((a1,a2) -> a1.nume.compareTo(a2.nume));
        set3.add(new Angajat("Horia",43));
        set3.add(new Angajat("Tudor",34));
        set3.add(new Angajat("Daria",52));
        set3.add(new Angajat("Elena",20));
        
        //set1.forEach(System.out::println);
        //set2.forEach(System.out::println);
        //set3.forEach(System.out::println);
    }
}
