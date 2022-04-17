public class Cutie<T> { //<T,W,Q>
    //int continut;
    T continut;
    //static T x;
    
    public Cutie() {}
    public Cutie(T continut) {}
    
    public T m1() {
        return continut;
    }
    
    public void m2(T param) {}
    
    //public static void m3(T p) {}
    public static <Q> void m4(Q q) {} //Cutie.<Integer>m4(3);
    
}