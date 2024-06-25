package Chapter9;

public class lowerupper {
    public static void main(String[] args) {
        
    
     //toLowercase function
        //concat function
        String s = "Shivprasad dhondikar is 50 year old ";
        s = s.toLowerCase();
        //System.out.println(s.toLowerCase());

        //nothing will happen
        System.out.println(s);
        System.out.println(s.toUpperCase());



        // concat
        String a = "abc";
        String b = "xxx";
        //a.concat(b); -> nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);

        String x = " ";
        System.out.println(x);
    
    
    }
    
}

    

