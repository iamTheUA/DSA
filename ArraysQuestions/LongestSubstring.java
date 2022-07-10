import java.util.HashSet;


//Approuch1 using HashSet. add till  
public class LongestSubstring {
    public static void main(String[] args) {
        String st = "dvdf";
        int h = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < st.length(); i++) {
            if(!set.contains(st.charAt(i))){
                set.add(st.charAt(i));
            }else{
                int j =i-1;
                while(j>=0 && st.charAt(i)!=st.charAt(j))j--;
                i=j+1;
                set.clear();
                set.add(st.charAt(i));
            }
            h = Math.max(h, set.size());
        }

        System.out.println(h);
    }    
}
