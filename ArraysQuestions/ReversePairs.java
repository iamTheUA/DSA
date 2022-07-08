public class ReversePairs {
    public static void main(String[] args) {
        int a[]= {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if((long)a[j]*2<(long)a[i]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }    
}
