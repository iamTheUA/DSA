public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        // int a[]= {4,5,7,1,2,3};

        printA1(a);
        //mergeSort(a, 0, a.length-1);
        sort(a, 0, a.length-1);

        // myMerge(a, 0, 2, 5);
        printA1(a);



    }

    

    static public void mergeSort(int a[], int l, int r){
        if(l<r){
            int mid = (l+(r))/2;

            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);

            myMerge(a, l, mid, r); // 1,2,3,4,5
        }
    }

    public static void myMerge(int a[], int l, int mid, int r) {

        // int i = l;
        // int j = mid+1;

        // int k = l;
        // int b[] = new int[mid];
        // int c[] = new int[r-mid];

        // for (int m = 0; m < mid; m++) {
        //     b[m]= a[l-m];
        // }
        // for (int m = 0; m < r-mid; m++) {
        //     c[m]= a[mid+m];
        // }
        // while(i<=mid && j<=r){
        //     if(a[i]<a[j]){

        //         i++;
        //     }else{
        //         a[]
        //     }
        // }
        

            System.out.println("l"+l+" r"+r+" mid"+mid);
        int i= l;
        int j = mid+1;
        int k = 0;
        int b[] = new int[a.length];
        while(i<mid && j<r){
            if(a[i]<a[j]){
                b[k]= a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        printA1(b);
        if(i>mid){
            while (j<r) {
                b[k] = a[j];
                k++;
                j++;
            }
        }else{
            while (i<mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        printA1(b);

        for (int m = l; m < r; m++) {
            a[m] = b[m];
        }
    }

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        int count =0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                count+=(m);
                j++;
            }
            k++;
        }
        System.out.println(count);
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver code
    














    // printing function
    public static void printA1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
