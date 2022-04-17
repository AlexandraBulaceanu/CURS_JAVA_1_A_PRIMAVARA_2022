public class ExString {
    public static void main(String [] args) {
        String s = "programare";
                 // 0123456789  
        System.out.println(s.charAt(2)); //o
        System.out.println(s.indexOf('m')); //6
        System.out.println(s.contains("gra")); //true
        System.out.println("bogdan".compareTo("bogdana"));// -1
                          // avem 3 cazuri : 1) sir1 < sir2 -> am o valoare negativa
                          //                 2) sir1 = sir2 -> 0
                          //                 3) sir1 > sir2 -> o valoare pozitiva
        System.out.println("buna".compareToIgnoreCase("Bau"));//20
        System.out.println("buna".equals("buna")); //true
        System.out.println(s.startsWith("pro")); //true
        System.out.println(s.endsWith("nare")); //false
        System.out.println(s.length()); //10
        System.out.println("AbC".toLowerCase()); //abc
        System.out.println("AbC".toUpperCase()); //ABC
        System.out.println(s.substring(2,6)); //=>[2,6) -> ogra
        System.out.println(s.substring(5)); // amare (ne ducem pana la finalul sirului)
        //System.out.println(s.substring(6,2)); //exceptie cand start > end
        System.out.println(s.substring(2,10)); //ogramare
        //System.out.println(s.substring(2,11)); //exceptie StringIndexOutOfBoundException
        System.out.println(" buna hei ");
        System.out.println(" buna hei ".trim()); //buna hei
        System.out.println("buna".concat("Andrei"));//bunaAndrei
        System.out.println(s.replace("ro","jk")); //pjkgramare
        System.out.println(String.valueOf(5)); //5 -> valoarea 5 ca si sir de caractere
        
        String sir = "buna"; //  "buna" -> prima instanta de String care ramane fara referinta
        sir=sir+" Alexandra"; //=> sir -> "buna Alexandra" -> o noua instanta care preia referinta sir
    }
}
