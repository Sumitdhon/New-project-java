package Chapter9;

public class Stringcom {
    public static void main(String[] args) {
        String s = "aaaaaabbbbbccccuuuuuuu";
        char[] arr= s.toCharArray();

        // String ans = " ";
        StringBuilder ans = new StringBuilder("");
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]==arr[i])
            j++;
            else{
                // ans += arr[i];
                ans.append(arr[i]);
                
                int len = j-i;
                // if(len>1) ans += len;
                if(len>1)
                ans.append(len);
                i = j;
            }
        }
               // ans += arr[i];
                ans.append(arr[i]);
                int len = j-i;
                // if(len>1) ans += len;
                if(len>1) ans.append(len);
                for ( i = 0; i < ans.length(); i++) {
                    arr[i] = ans.charAt(i);
                    
                }
                System.out.println(ans);
        
    }

    
}
