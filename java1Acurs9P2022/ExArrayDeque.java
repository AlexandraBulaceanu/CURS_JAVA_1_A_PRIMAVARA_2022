import java.util.*;
public class ExArrayDeque {
    public static void main(String [] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.push(10);//adauga la inceput
        deq.offer(20);//adauga la final
        deq.peek();//returneze elem de la inceput, fara eliminare
        deq.poll();//retuneaza si elimina elem de la inceput, daca nu exista returneaza null
        deq.pop();//retuneaza si elimina elem de la inceput, daca nu exista arunca exceptie
        
        //COADA -> FIFO(FIRST IN FIRST OUT) : offer + pop
        //STIVA -> LIFO(LAST IN FIRST OUT) : push + pop
    }
}
