package DSA.ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Approuch 1 -- sort the array. and check..
//Approuch 2 -- use hashMap. add all and then check i+1 and i ispresent or not.


//Approuch 3 -- use HashSet. 
public class LongestCOnsecutiveSequence {

    public static void main(String[] args) {
        
        int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
       
        if(nums.length==0){
        
        }
        if(nums.length==1){
            
        }
        Set < Integer > hashSet = new HashSet < Integer > ();
        for (int num: nums) {
            hashSet.add(num);
        }

        int longestStreak = 0;

        for (int num: nums) {
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println(longestStreak);
        Arrays.sort(nums);
        System.out.println(

            Arrays.toString(nums)
            );
    }
}
