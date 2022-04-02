public class Conexiune {
    //implementare lazy de singleton
    String nume;
    
    private Conexiune() {}
    
    private static Conexiune SINGLETON;
    
    public static Conexiune getInstance() {
        if(SINGLETON == null) {
            SINGLETON = new Conexiune();
        }
        return SINGLETON;
    }
    
    
    //eager 
    //private static final Conexiune = new Conexiune();
}