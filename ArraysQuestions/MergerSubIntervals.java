

/**
 * Rough
 */
public class MergerSubIntervals {

    public static void main(String[] args) {

        int[][] a = { {2,3},{4,5},{6,7},{1,10} };

        int[] min=a[0];
        for (int i = 0; i < a.length; i++) {
            min=a[i];
            for (int j = i+1; j < a.length; j++) {
                if(min[0]>a[j][0]){
                    min= a[j];
                    a[j]=a[i];
                    a[i]=min; 
                }
                else if(min[0]==a[j][0] ){
                    if(min[1]>a[j][1]){
                        min= a[j];
                        a[j]=a[i];
                        a[i]=min;
                    }
                }
            }
        }

        printA2(a);
        int s = a[0][0];
        int e = a[0][1];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) { 
            } else {
                
                s = Math.min(s, a[i][0]);
                if (e >= a[i][0] ) {
                    if(e <= a[i][1]){
                        e=a[i][1];
                    }
                } else {
                    count++;
                    s = a[i][0];
                    e = a[i][1];
                }
            }
        }
        int[][] b = new int[count][2];

        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                s = a[0][0];
                e = a[0][1];
            } else {
                
                s = Math.min(s, a[i][0]);
                if (e >= a[i][0]) {
                    if(e <= a[i][1]){
                        e=a[i][1];
                    }
                } else {
                    b[pos][0] = s;
                    b[pos][1] = e;
                    pos++;
                    s = a[i][0];
                    e = a[i][1];
                }
            }
        }

        System.out.println(count);
        b[pos][0] = s;
        b[pos][1] = e;
        
        printA2(b);

        // System.out.println(c);

        // for (int i = 0; i < a.length; i++) {
        // for (int j = i; j < a.length; j++) {
        // int t= a[i][j];
        // a[i][j] = a[j][i];
        // a[j][i] = t;
        // }
        // }

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a.length/2; j++) {
        // int t= a[i][j];
        // a[i][j] = a[i][a.length-1-j];
        // a[i][a.length-1-j] = t;
        // }
        // }

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a.length; j++) {
        // System.out.print(a[i][j] +" ");
        // }
        // System.out.println();
        // }

    }

    public static void printA2(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
