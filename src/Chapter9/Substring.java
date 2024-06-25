package Chapter9;

public class Substring {
    public static void main(String[] args) {
        String s = "abcde";
        // System.out.println(s.substring(3));
        // System.out.println(s.substring(1, 4));

        //print all substrings

        for (int i =0; i <s.length(); i++) {
            for (int j =i+ 1; j <=5; j++) {
                System.out.print(s.substring(i, j)+" ");
               
            }
            System.out.println();
          
            
        }
    }
    
}
