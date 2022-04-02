public class ExPolimorfism {
    public static void main(String [] args) {
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        Reptila a = new Crocodil();//polimorfisim
        //Reptila = clasa superioara(cea care este mostenita) = forma
        //a = referinta care are ca si tip de data cls superioara si arata catre o instanta de 
              //Crocodil (clasa copil, cea care mosteneste)
        //Crocodil = instanta efectiva care se creeaza in memorie, dar ia forma de Reptila
        
        a.greutate = 35;
        //a.lungimeCoada = 8;//caracteristica ce NU apartine formei
        System.out.println(a.temperatura);//pt atribut (in cazul hiding fields -> 
        //ascundereea campurilor) -> se ia valoarea din forma => val din Reptila
        a.afisareDenumire();//pt comportamente -> se apeleaza suprascrierea -> implementarea din 
                            //copil => Crocodil
                            
        /*a = (Crocodil)a;
        a.lungimeCoada = 8;
        aici daca nu il salvez eu o sa il pastreze Reptila*/
        Crocodil c2 = (Crocodil)a;
        c2.lungimeCoada = 9;
        //Crocodil c3 = (Crocodil)r1; -> ClassCastException la mom rularii
        //Crocodil c4 = new Reptila();
        
        Reptila s = new Sarpe();
        Reptila v = new SarpeVeninos();
        //SarpeVeninos v1 = (SarpeVeninos)s; //-> ClassCastException la mom rularii
        SarpeVeninos v2 = (SarpeVeninos)v;
        
        String mesaj = "ceva";
        //Sarpe s1 = (Sarpe)mesaj; // -> eroare de compilare
        
        //instanceof
        if(c1 instanceof Crocodil) {
            System.out.println("c1 este o instanta de crocodil");
        }
        if(s instanceof SarpeVeninos) {
            System.out.println("s este o instanta de sarpe veninos");
        }
        if(null instanceof Reptila) {
            System.out.println("null e de tip Reptila - false");
        }
        /*if(c1 instanceof Sarpe) {
            
        }*/
        
        
    }
}