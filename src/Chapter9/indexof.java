package Chapter9;

public class indexof {
    public static void main(String[] args) {
        String s = "Shivprasad dhondikar ";
        System.out.println(s.indexOf('d'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        
        //compare function
        String a = "abczzfhj";
        String b =  "dbc";
        System.out.println(a.compareTo(b));

        //contains function
        //startsWith function
        //endsWith function
        String c = "unacademy ";
        System.out.println(c.contains("a"));
        System.out.println(c.startsWith("una"));
        System.out.println(c.endsWith("my"));

        // this are all basic func of strings
        System.out.println();


    }
}