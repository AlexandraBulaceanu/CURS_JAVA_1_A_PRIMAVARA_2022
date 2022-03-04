public class ExIfElse {
    public static void main(String [] args) {
        if(10<6) {
            System.out.println("caz adevarat");
        } else {
            System.out.println("caz fals");
        }
        
        if(false) {
            System.out.println("nu o sa fie afisat niciodata");
        }
        
        boolean a;
        if(a=true) {
            System.out.println("intotdeauna");
        }
        
        int x = 7;
        int y = 7;
        if(x > y) {
            System.out.println("x este mai mare decat y");
        } else if(x < y){ 
            System.out.println("x este mai mic decat y");
        } else {
            System.out.println("x este egal cu y");
        }
        
        //Ex operator ternar = Elvis
        int c = 7, d = 11;
        int rez = c > d ? 15 : 17;
                 //cond  //t   //f
        System.out.println(rez);
        //a>b ? c>=d || f>g ? 10 : 20 : 40;
    }
}