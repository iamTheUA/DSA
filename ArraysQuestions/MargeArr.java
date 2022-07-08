
public class MargeArr {

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 9, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3, n = nums2.length;

        int i = 0;
        for (; i < m; i++) {
            if(nums1[i]>nums2[0]){
                int t = nums1[i];
                nums1[i]=nums2[0];
                nums2[0]=t;
            }

            int f = nums2[0];
            int j = 1;
            for (; j < n && nums2[j]<f; j++) {
                nums2[j-1]= nums2[j];
            }
            nums2[j-1]=f;
        }
        for (; i < n+m; i++) {
            nums1[i]=nums2[i-m];
        }        
        
        printA1(nums1);
    }

    public static void printA2(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printA1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
                // Approuch 1
                // int[] r = new int[m + n];
                // int a1 = 0, a2 = 0;
                // for (int i = 0; i < m + n; i++) {
                //     if (a1 < m && a2 < n) {
                //         if (nums1[a1] < nums2[a2]) {
                //             r[i] = nums1[a1];
                //             a1++;
                //         } else {
                //             r[i] = nums2[a2];
                //             a2++;
                //         }
                //     } else {
                //         if (a1 == m) {
                //             r[i] = nums2[a2];
                //             a2++;
                //         } else {
                //             r[i] = nums1[a1];
                //             a1++;
                //         }
                //     }
                // }
                // nums1 = r;

                //Approuch 2
                //add nums2 in nums1 and sort it.
