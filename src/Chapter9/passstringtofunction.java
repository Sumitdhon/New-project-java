package Chapter9;

import chapter1.character;

public class passstringtofunction {
    public static void main(String[] args) {
        String s = " Sumit ";
        System.out.println(s);
        change(s);
        System.out.println(s);

    }
    public static void change(String s){
        s = "Amit";
    }
    
}
