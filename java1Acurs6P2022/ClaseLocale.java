public class ClaseLocale {
    int x;
    static int y;
    
    public void metNS() {
        int z = 20;
        class LocalaInContextNonStatic {
            public void m() {
                //z = 10;
                System.out.println(z);
                System.out.println(x);
            }
        }
    }
    
    public static void metS() {
        int z = 20; //final (constanta) sau efectiv finala (sa nu i se schimbe val)
        class LocalaInContextStatic {
            public void m() {
                //z = 10;
                System.out.println(z);
                //System.out.println(x);
                System.out.println(y);
            }
        }
    }
}