public class ExObject {
    public static void main(String [] args) {
        Persoana p1 = new Persoana("Mihai",23,"programator");
        Persoana p2 = new Persoana("Irina",23,"manager");
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1 == p2); //false -> asta e si implementarea default a lui equals
                                     //egalitate dintre referinte
        Persoana p3 = p1;
        System.out.println(p1.equals(p3)); //true
        System.out.println(p1 == p3); //true
        
        System.out.println(p2);
        System.out.println(p1.toString());
    }
}