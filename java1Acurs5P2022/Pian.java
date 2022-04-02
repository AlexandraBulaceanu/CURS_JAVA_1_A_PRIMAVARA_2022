public class Pian implements InstrumentMuzical {
    @Override
    public void cantaLaInstrument() {
        System.out.println("se apasa pe clape");
    }
}

/**
 * cls; cls -> extends
 * interfata; interfata -> extends
 * cls; interfata -> implements
 * interfata; clasa -> NU este posibila
 * 
 * Clasa1 extends Clasa2 implements Interf1, Interf2, ...... , Interfn
 */