public class ExExceptieBanca4 {
    public static void main(String [] args) {
        System.out.println("Vreau sa extrag 500 de lei de pe card!");
        try {
            extragereNumerar(10);
            System.out.println("Operatiune realizata cu succes!");
        } catch(ExceptieCopil e) {
            System.out.println(e.getMessage());
        } catch(ExceptieSuper e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("intotdeauna la final - de la cel mai particular pana la cel mai general");
        }finally {
            System.out.println("Se executa intotdeauna, indiferent de aruncare de exceptii!");
        }
    }
    public static void extragereNumerar(double suma) throws ExceptieSuper {
        if(suma > 300) {
            ExceptieSuper e = new ExceptieSuper();
            throw e;//arunc instanta de exceptie = semnalez aparitia situatiei de exceptie
        } else if (suma < 30) {
            System.out.println("Prea putini bani");
            throw new ExceptieCopil();
            
        }else {
            System.out.println("Poftiti banii!");
        }
    }
}