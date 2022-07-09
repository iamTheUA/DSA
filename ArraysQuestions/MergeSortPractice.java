public class MergeSortPractice {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,6,9,0};
        mergeSort(arr, 0, arr.length-1);
        printA1(arr);
        System.out.println("yo");

    }

    public static void printA1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
                                //l=0, r=7
    public static void mergeSort(int[] a, int l, int r) {
        
        if(l<r){
            int m =(r+l)>>1; //3
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);

            merge(a, l, m, r);
        }
    }

    public static void merge(int[] a, int l, int m, int r) {
        int l1 = m+1-l;
        int l2 = r-m;

        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];

        for (int i = 0; i < l1; ++i) {
            arr1[i]= a[l+i];
        }
        for (int i = 0; i < l2; ++i) {
            arr2[i]= a[m+i+1];
        }

        int a1=0, a2=0;
        int i = l;
        while (a1<l1 && a2<l2) {
            if(arr1[a1]>arr2[a2]){
                a[i]=arr2[a2];
                a2++;
            }else{
                a[i]=arr1[a1];
                a1++;
            }
            i++;
        }

        while(a1<l1){
            a[i]=arr1[a1];
            i++;
            a1++;
        }

        while(a2<l2){
            a[i]=arr2[a2];
            i++;
            a2++;
        }
        
    }
}
