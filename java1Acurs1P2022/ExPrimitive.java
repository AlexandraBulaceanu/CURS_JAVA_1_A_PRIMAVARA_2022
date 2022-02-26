/**
Clasa reprezinta un exemplu pentru primitive.

@author Alexandra
@version 1.0
*/

public class ExPrimitive {
    public static void main(String [] args) {
        byte b1;//declarare de variabila de tipul byte ( = val numerica, pe 1 byte) si e numita b1
        /*comentariu
          pe mai multe 
          linii
        */
        b1 = 5;
        byte b2 = 15;//initializare
        short s1, s2, s3, s4;
        int i1 = 10;
        long l1 = 23;
        System.out.println(i1);
        
        long l2 = 1_000_000; //ac lucru cu 1000000
        long l3 = 10000000000L;
        float f1 = 20.3f;
        float f2 = (float)15.6;
        double d1 = 18.2;
        
        boolean bol1 = true;
        boolean bol2 = false;
        
        char c1 = 'a';
        char c2 = '\u00DF';
        char c3 = '\n';
        System.out.println(c2);
        
        String sir;//NU e primitiva, e referinta
        sir = "mesaj";
        System.out.println(sir);
    }
}