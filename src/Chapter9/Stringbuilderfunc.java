package Chapter9;

public class Stringbuilderfunc {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcxduhius");
        StringBuilder tb = new StringBuilder("madhav");
       
        System.out.println(sb.length());
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.reverse());
    }
    
}
