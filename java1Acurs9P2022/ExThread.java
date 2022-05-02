public class ExThread {
    public static void main(String [] args) {
        NrImpareThread it = new NrImpareThread(); //NEW
        it.start(); //RUNNABLE 
        //!!!!!!! start() != run() !!!!!!!!
        //it.run() -> rulam instructiunile pe ac fir cu main
        
        NrPareThread pt = new NrPareThread();//task = doar ce vreau eu sa fie executat pe firul
                                               //de executie
        Thread t = new Thread(pt);//mecanismul de fir de executie
        t.start();
        
        System.out.println("Finalul!");
        
    }
}