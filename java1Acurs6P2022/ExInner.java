public class ExInner {
    public static void main(String [] args) {
        TopLevelOuter.InnerStatic is = new  TopLevelOuter.InnerStatic();
        TopLevelOuter o = new TopLevelOuter();
        TopLevelOuter.InnerNonStatica ins = o.new InnerNonStatica();
        //instanta ins a clasei InnerNonStatica apartine instantei o a clasei outer
        
        System.out.println(o.x);
        ins.met1(); //se comporta ins (interioara), se modifica instanta o(exterioara)
        System.out.println(o.x);
        
        Masina masina = new Masina();
        Masina.Motor motor = masina.new Motor();//motorul aparine masinii
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
    }
}