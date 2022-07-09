package DSA.ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum4 {

    // Approuch 1--
    // sorting the array and then using 2sum algo and keeping two other pointer in
    // loop.
    // approuch 2 at the end.

    public static void main(String[] args) {
        int w[] = { 9,1,4,7,3,-1,0,5,8,-1,6 };
        int t = 0;
        printA1(w);
        Arrays.sort(w);
        printA1(w);
        
        List<List<Integer>> list = new ArrayList<>();
        int a = 0, b = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = i + 1; j < w.length; j++) {
                a = j + 1;
                b = w.length - 1;
                while (a < b) {
                    // System.out.println(w[i]+" "+w[j]+" "+w[a]+" "+w[b]+" ");
                    if ((long) w[a] + (long) w[b] == (long) t - (long) w[i] - (long) w[j]) {

                        list.add(Arrays.asList(w[i], w[j], w[a], w[b]));

                        long front = (long) w[a];
                        while (a < b && w[a] == front) {
                            ++a;
                           // System.out.println("front: " + front + "  " + (a < b) + " " + (w[a] == front));
                        }
                        ;

                        long back = (long) w[b];
                        while (a < b && (long) w[b] == (long) back) {
                            --b;
                           // System.out.println("back: " + back);
                        }
                        ;
                        // System.out.println("in");
                        // a++; b--;
                    } else if ((long) w[a] + (long) w[b] < (long) t - (long) w[i] - (long) w[j]) {
                        // if(a<)
                        a++;
                    } else {
                        b--;
                    }
                }
                while (j + 1 < w.length && (long) w[j + 1] == (long) w[j])
                    ++j;

            }
            while (i + 1 < w.length && (long) w[i + 1] == (long) w[i])
                ++i;
        }

        System.out.println(list);

        // Approuch 2
        // Sort the array
        // use 3 pointers in loop and 4th to search in rest of the array using "Binary
        // search".

    }

    static void printA1(int[] w) {
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.println();
    }

    static void printA2(int[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {
                System.out.print(w[i][j] + " ");
            }
            System.out.println();
        }
    }
}