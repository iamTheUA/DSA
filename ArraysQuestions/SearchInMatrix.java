public class SearchInMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int e = 21;
        boolean found= false;
        for (int i = 0; i < a.length; i++) {
            if(e<=a[i][a[0].length-1]){
                for (int j = 0; j < a[0].length; j++) {
                    if(e==a[i][j]){
                        found= true;
                    }
                }
            }
        }
        System.out.println(found);
    }
}
