/**
 * GridUniquePath
 */
public class GridUniquePath {

    public static void main(String[] args) {
        int n = 4, m=4;
        System.out.println(uniquePath(0, 0
        , n, m));

    }


    //Approuch 1 using recussion.
    public static int uniquePath(int a, int b, int n, int m) {
        if(a>=n || b>=m)return 0;
        if(a==n-1 && b==m-1)return 1;
        return uniquePath(a+1, b, n, m) + uniquePath(a, b+1, n, m);
    }

    //Approuch 2 using recusion and DP 
    // like create same size matrix and with every element -1.
    // when visited one cell use place the total path from that cell... 
    // now if revisiting. then just add the cell's value.


    //Approuch 3 Using CnP.
    //total no. of combination of right and down...  
}
