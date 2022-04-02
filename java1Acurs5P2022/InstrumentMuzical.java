public interface InstrumentMuzical {
    //int z;
    public static final int z = 5;
    String mesaj = "buna";
    
    //void cantaLaInstrument(){}
    public void cantaLaInstrument(); //abstract este pus in mod automat
    
    //J8
    default void metodaConcreta() {}
    
    static void metodaStatica() {}
    
    //J9
    private void metodaPrivata() {}
}