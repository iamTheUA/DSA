
/*
1. just count no. of occurence and then edit the array.
2. Dutch national flag algo: moving indexes low, mid, high. and swap.

*/
public class Sorting123 {
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0,2,1,2,0,2,1,1,0};

        int l=0,m=0,h=a.length;
        while(m<=h && m>=l){
            switch (a[m]) {
                case 0:
                    swap(a, l, m);
                    l++;
                    m++;
                    break;
            
                case 1:
                    m++;
                    break;
            
                case 2:
                    swap(a, m, h);
                    h++;
                    break;
            }
        }
        printa(a);
    }

    static public void printa(int[] a) {
        for (int o : a) {
            System.out.print(o);
        }

    }
    static public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
}
