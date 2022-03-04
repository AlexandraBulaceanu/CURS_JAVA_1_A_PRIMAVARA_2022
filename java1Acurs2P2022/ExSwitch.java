/**
 In functie de valoarea unei variabile de test, vom afisa in consola ocupatia unei personalitati.
*/
public class ExSwitch {
    public static void main(String [] args) {
        String personalitate = "Calinescu";
        
        switch(personalitate) {
            case "Mozart":   System.out.println("era compozitor");
                             break;
            case "Picasso": System.out.println("era pictor");
                            break;
            case "Kafka":
            case "Orwell":  System.out.println("era scriitor");
                            break;
            default: System.out.println("nu se cunoaste ocupatia");
        }
    }
}