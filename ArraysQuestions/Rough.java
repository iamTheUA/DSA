

/**
 * Rough
 */
public class Rough {
    


    public static void main(String[] args) {

        // int[] a = {4,3,2,1};
        // int[] a = {3,4,2,1};
        // int[] a = {2,1,4,3};
        // int[] a = {1,2,3,4};
        // int[] a = {1,5,1};
        int[] a = {5,1,1};
        
        // ArrayList<Integer> a = Arrays.asList({1,3,4,2}); 
        //1234,1243,1324,1342,1423,1432,2134,2143,2314,2341,3124,3142,3214,3241
                                           //2413 
        if(a.length==0 || a.length==1){
        return;
        }
        
        int i = a.length-2;

        // for(;i>0 && a[i]>a[i+1];i--);
        while (i>=0 && a[i]>=a[i+1]) {
            i--;
        }
        if(i==-1){
            
        }else{
            int j =i+1;
            for(; j<a.length;j++){
                if(a[j]<=a[i]){
                    break;
                    // swap(a, i, j++);
                }
            }
            System.out.println(i+" i and j "+j);
            swap(a, i, --j);
        }
        rev(a, i+1, a.length-1);
        printa(a);

    }
    static public void printa(int[] a) {
        for (int o : a) {
            System.out.print(o);
        }

    }
    static public void rev(int[] a, int i, int j) {
        while (i<j) {
            swap(a, i++, j--);
        }
    }
    
    static public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
}
