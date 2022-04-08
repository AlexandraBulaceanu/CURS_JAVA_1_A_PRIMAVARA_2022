public class ExExceptieBanca2 {
    public static void main(String [] args) {
        System.out.println("Vreau sa extrag 500 de lei de pe card!");
        try {
            extragereNumerar(10);
            System.out.println("Operatiune realizata cu succes!");
        } catch(SoldInsuficientException e) {
            System.out.println(e.getMessage());
        } catch(ExceptieChecked e) {
            e.printStackTrace();
        } finally {
            System.out.println("Se executa intotdeauna, indiferent de aruncare de exceptii!");
        }
    }
    public static void extragereNumerar(double suma) throws SoldInsuficientException,ExceptieChecked {
        if(suma > 300) {
            SoldInsuficientException e = new SoldInsuficientException();
            throw e;//arunc instanta de exceptie = semnalez aparitia situatiei de exceptie
        } else if (suma < 30) {
            throw new ExceptieChecked();
        }else {
            System.out.println("Poftiti banii!");
        }
    }
}