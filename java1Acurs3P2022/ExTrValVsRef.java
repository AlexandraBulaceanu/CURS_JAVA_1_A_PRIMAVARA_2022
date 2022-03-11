public class ExTrValVsRef {
    public static void main(String [] args) {
        TrValVsRef t = new TrValVsRef();
        
        int x = 20;
        System.out.println("x inainte de apel metoda: "+x);
        //t.transferPrinValoare(x);
        x = t.transferPrinValoare(x);
        System.out.println("x dupa apel de metoda: "+x);
        
        Angajat a = new Angajat("Mihai",6500,27,3);
        System.out.println("varsta inainte de apel metoda: "+a.varsta);
        t.transferPrinReferinta(a);
        System.out.println("varsta dupa apel metoda: "+a.varsta);
        
        //J10
        //var
        int z;
        z = 20;
        var sir = "Buna";
        //sir = 10;
        //var y;
        //var g = null;
        var a2 = new Angajat("Gogu",4566,23,1); // a2 are tip Angajat
    }
}