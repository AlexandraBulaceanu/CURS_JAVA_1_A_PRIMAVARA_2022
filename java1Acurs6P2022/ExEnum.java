public class ExEnum {
    public static void main(String [] args) {
        Cafea c1 = Cafea.LARGE;
        switch(c1) {
            case SMALL: System.out.println("Poate ai vrea sa bei mai multa");
                        break;
            case MEDIUM: System.out.println("O cantitate ok");
                         break;
            case LARGE:
            case EXTRA_LARGE: System.out.println("Bei cam multa cafea");
        }
        
        for(Cafea c : Cafea.values()) {
            System.out.println(c+" "+c.ordinal()+" "+c.name());
            c.afiseazaCantitate();
        }
        
        c1.afiseazaCantitate();
    }
}