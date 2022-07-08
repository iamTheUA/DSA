public class Fib {
    public static void main(String[] args) {
        int n= 6;
        int fibR= fib(n);





        int z=1,x=1;
        int f = 0;
        for (int i = 0; i < n; i++) {
            if(i==0){
                f=1;
            }
            else if(i==1){
                f=1;
            }else{

                f=z+x;
                x=z;
                z=f;
            }
        }
        System.out.println(f);

        System.out.println(fibR);
    }

    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        return fib(n-1)+ fib(n-2);
    }
}
