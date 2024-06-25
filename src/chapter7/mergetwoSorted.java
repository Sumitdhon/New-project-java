package chapter7;

public class mergetwoSorted {
    public static void main(String[] args) {
        int[] a={11,25,33,74};
        int[] b={26,54,87,39};
        int m=a.length,n=b.length;
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        //merging
        while (i<a.length && j<b.length) {
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;

            }
            if(i==a.length){
                // now take elements from b only
                while (j<b.length) {
                    c[k]=b[j];
                    j++;
                    k++;
                    
                }
            }
            if(i==a.length){
                // now take elements from b only
                while (j<b.length) {
                    c[k]=b[j];
                    j++;
                    k++;
            
                }
            }      
        }
        for(int ele: c){
        System.out.println(ele+" ");
        }
    }
}
    
