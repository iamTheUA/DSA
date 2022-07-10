public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,2,7,8,1,9,3,5};
        quickSort(arr, 0, arr.length-1);
        printA1(arr);
    }

    public static void printA1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] a, int l,int h) {
        if(l<h){
            int p = partition(a, l, h);
            quickSort(a, l, p-1);
            quickSort(a, p+1, h);
        }
    }

    public static int partition(int[] a, int l, int h) {
        
        int p = l, i = l, j = h;
        while(i<j){
            while(a[i]<a[p])i++;
            while(a[j]>a[p])j--;
            if(i<j){
                swap(a, i, j);
            }
        }
        swap(a, j, l);
        return j;
    
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
