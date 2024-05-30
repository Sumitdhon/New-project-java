package chapter3;

public class condition {
    public static void main(String[] args) {
        int x=1;
        int y=9;
        while(x>=0){
            x--;
            y++;
            if(x==y)
            continue;
            else
            System.out.println(x+" "+y);
        }
    }
    
}
