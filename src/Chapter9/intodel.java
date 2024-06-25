package Chapter9;

public class intodel {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("xyhjfhz");
        System.out.println(sb);
        sb.delete(2,5 );

        System.out.println(sb); //abhjfhz

        //-> gyz

        sb.insert(2, 'g');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
    
}
