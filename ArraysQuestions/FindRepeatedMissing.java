import java.util.HashMap;

public class FindRepeatedMissing {
    public static void main(String[] args) {
        int a[] = {1,2,4,6,3,3};

        int[] re = repeatedMissing(a);
        printA1(re);
        

    }

    public static int[] repeatedMissing(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int re = 0;
        int sum= 0;
        for (int i = 0; i < a.length; i++) {
            if(map.put(a[i], 0)!=null){
                re = a[i];
            }else{
                sum+=a[i];
            }
        }
        int tSum=0;
        for (int i = 1; i <= a.length; i++) {
            tSum+=i;
        }
        int[] b = {re, (tSum-sum)};
        return b;
    }

    public static void printA1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
