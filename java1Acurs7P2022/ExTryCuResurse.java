public class ExTryCuResurse {
    public static void main(String [] args) {
        try(ConexiuneBD con1 = new ConexiuneBD();
            ConexiuneBD con2 = new ConexiuneBD()) {
            //utilizam aici resursele
        } catch(Exception e) {
            System.out.println(e.getMessage());
            //e = exceptia principala = prima exceptie care a fost aruncata
            //restul exceptiilor(daca mai apar) vor fi ascunse -> intr-un vector suppresed
            Throwable[] suppressed = e.getSuppressed();
            for(Throwable t : suppressed) {
                System.out.println(t);
            }
        } finally {
            System.out.println("finally explicit");
        }
    }
}
