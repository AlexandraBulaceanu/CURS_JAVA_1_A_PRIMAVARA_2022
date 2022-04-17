public class ExGenerice {
    public static void main(String [] args) {
        Cutie c1 = new Cutie();//implicit pt T cu Object
        
        Cutie<?> c2;//constrangere unbounded -> absenta unei constrangeri -> sa pun orice tip de data aici
        c2 = new Cutie<Integer>();//continut o sa aiba tipul de data Integer pentru instanta c2
        c2 = new Cutie<int[]>();
        c2 = new Cutie<Lego>();
        
        Cutie<Lego> c3;//constrangere directa -> doar tipul specificat
        c3 = new Cutie<Lego>();
        
        Cutie<Number> c4;
        //c4 = new Cutie<Integer>(); //nici macar regului de polimorfism nu mai sunt valabile
        
        Cutie<Integer> c5;
        c5 = new Cutie<>();//J7 -> sintaxa diamond
        
        Cutie<? extends Number> c6;//constrangere upperbounded -> pot sa am doar clase copil sau clasa in sine
        c6 = new Cutie<Integer>();
        
        Cutie<? super Number> c7;//constrangere lowerbounded -> pot sa pun doar clase superioare sau clasa in sine
        c7 = new Cutie<Object>();
    }
}