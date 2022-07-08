/**
 * MajorityEleMooreVotingAlgo
 */
public class MajorityEleMooreVotingAlgo {
    public static void main(String[] args) {
        int a[] = {4,5,9,9,1,6,9,9,4,4,9,3,9};

        int count = 0;
        int ele = 0;
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]==ele) count++;
            else if(count==0){ele=a[i];count++;}
            else count--;
        }

        System.out.println(ele);

    }
}
