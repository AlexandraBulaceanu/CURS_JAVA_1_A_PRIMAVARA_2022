public class ExPisica {
    public static void main(String [] args) {
        int x;
        x = 10;
        Pisica p1;
        p1 = new Pisica("Tom",2,"gri",5.6);//apelez constructor implicit, pt ca nu am dat eu unul explicit in clasa
        p1.nume = "Kitty";
        System.out.println(p1.nume);
        System.out.println(p1.varsta);
        System.out.println(p1.culoare);
        System.out.println(p1.greutate);
        
        int y = x;
        Pisica p2 = p1;
        System.out.println(p2.nume);
        System.out.println(p2.varsta);
        System.out.println(p2.culoare);
        System.out.println(p2.greutate);
        p2.varsta = 10;
        System.out.println(p1.varsta);
        System.out.println(p2.varsta);
        
        Pisica p3 = new Pisica("Lea",3,"alb",4);
        System.out.println(p3.nume);
        System.out.println(p3.varsta);
        System.out.println(p3.culoare);
        System.out.println(p3.greutate);
        
        //apel comportament
        p1.spuneMiau();
        p3.spuneMiau();
    }
}