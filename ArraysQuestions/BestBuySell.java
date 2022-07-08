public class BestBuySell {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};

        /* Approuch 1 */
        // int tD = 0;
        // int d = 0;
        // for(int i =0; i<a.length; i++){

        // for (int j = i; j < a.length; j++) {
        // if(a[j]-a[i]>d){
        // d=a[j]-a[i];
        // System.out.println(d);
        // }
        // }
        // if(d>tD){
        // tD=d;
        // }
        // }

        // System.out.println("tD: "+tD);
        // System.out.println("d: "+d);
        
        
        // 2,1,5,3,6,4 
        
        /* Approuch 2 */
        int l = 0;
        int d =0; 
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[l]){
                l=i;
            }    

            if(d<a[i]-a[l]){
                d=a[i]-a[l];
            }
        }
        System.out.println(d);


        //2 4 1
        // int maxDiff = 0;
        // int lP = Integer.MAX_VALUE;//2
        // for (int i = 0; i < a.length; i++) {
        //     lP = Math.min(lP, a[i]);
        //     maxDiff = Math.max(maxDiff, a[i] - lP);
        // }
        // System.out.println(maxDiff);
    }
}
