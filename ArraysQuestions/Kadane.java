public class Kadane {

    public static void main(String[] afg){
        
        int[] a = {-2,-1};
        int n = a.length;

        
        int sum = 0;
        int totalSum = a[0];

        if(a.length==1){
            return; 
        }
        for(int i=0; i<n; i++){
            sum+=a[i];
            if(totalSum<sum){
                totalSum=sum;
                System.out.println("Tsum=> "+totalSum);
            }
            if(sum<0){
                sum= 0;
            }
        }
        System.out.println(totalSum);
        System.out.println(sum);

    }
}
