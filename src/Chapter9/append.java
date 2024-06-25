package Chapter9;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        char[] ch = {'r','a','j'};
        sb.append(ch);
        System.out.println(sb);

        StringBuilder t =  new StringBuilder("pqr");
        sb.append(t);
        System.out.println(sb);
    }
    
}
