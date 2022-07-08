import java.util.ArrayList;
import java.util.List;

/*  To find the element which occures more then N/3 times.   
 *  So, there can only be 2 elements in array. if 3 ele, then all ele be equal to N/3 not >N/3.
 * 
 * approch 1 - use hashmap.
*/
//approuch 2- Extender Boyer Moore's Voting algo.

public class BoyerMoore {
    public static void main(String[] args) {
        int a[] = {3,4,5,5,4,5,4,2};

        int count1 = 0, count2 = 0, v1 = Integer.MIN_VALUE, v2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(v1 == a[i]){
                count1+=1;
            } 
            else if(v2 == a[i]) {
                count2+=1;
            }
            else if(count1==0) {
                v1 = a[i];
                count1+=1;
            }
            else if(count2==0) {
                v2 = a[i];
                count2+=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0; count2=0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i< a.length; i++ ){
            if(a[i]==v1)count1++;
            if(a[i]==v2)count2++;
        }
        
        if(count1>(a.length/3))list.add(v1);
        if(count2>(a.length/3))list.add(v2);
        
        

        System.out.println(v1+"  "+v2);
        System.out.println(list);
        System.out.println(count1+"  "+count2);
    }
}
