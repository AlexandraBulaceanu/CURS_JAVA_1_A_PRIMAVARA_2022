import java.util.*;
public class ExStringBuilder {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder(line);
        sb.append("mesaj").delete(1,4).reverse();
        //line = buna + mesaj -> bunamesaj
        //sb = bmesaj -> jasemb
        //sb.append("mesaj").delete(1,4).substring(3,5).reverse();
        System.out.println(sb);
        
        //NumeClasa().setAtrtib1().setAtrib2().build();
        //list.stream().map().distict().forEach();
    }
}
