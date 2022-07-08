public class FindRepeatedNum {
    public static void main(String[] args) {
        // find the repeated number in array.
        int a[] = {5,2,7,6,5,4};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]) System.out.println(a[j]);
            }
        }
        
        
    }
}

//          Approch 1
// HashMap<Integer, String> map = new HashMap<>();
// for (int i : a) {
//     if(map.put(i,"  ")!=null){
//         System.out.println(i);
//     }
// }

//          Approuch 2
// for (int i = 0; i < a.length; i++) {
//     for (int j = i+1; j < a.length; j++) {
//         if(a[i]==a[j]) System.out.println(a[j]);
//     }
// }

//          Approuch 3
// Sort the array
// search for a[i]=a[i+1] return!

//          Approuch 4
// using Frequency Array!
// f.length = a.length;
// place 1 in f[a[i]]
// if any f[a[i]]!=0  --- our number!
