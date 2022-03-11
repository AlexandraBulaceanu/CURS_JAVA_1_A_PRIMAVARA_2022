public class TrValVsRef {
    /*void transferPrinValoare(int x) {
        x = x + 10; //modificarea parametrului
        System.out.println("x in metoda "+x);
    }*/
    int transferPrinValoare(int x) {
        x = x + 10; //modificarea parametrului
        System.out.println("x in metoda "+x);
        return x;
    }
    
    void transferPrinReferinta(Angajat a1) { // Angajat a1 = a;
        a1.varsta = 50;
        System.out.println("varsta in metoda "+a1.varsta);
    }
}