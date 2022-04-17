public class ExPredicat {
    public static void main(String [] args) {
        Predicat<String> predString = new Predicat<>(){
            @Override
            public boolean test(String s) {
                return s.length()%2 == 0;
            }
        };
        
        Predicat<Integer> predInt = x -> x > 20;
        Predicat<Lego> predLego = (Lego l) -> {return l.culoare.equals("rosu");};
    }
}