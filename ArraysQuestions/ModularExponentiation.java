public class ModularExponentiation {
    public static void main(String[] args) {
        int x = 5, n = 125, m = 7; // 5 125 7 //7 5 1
        // double g = 123456752323423232323232345.0;
        double g = (Math.pow((double) x, (double) n));
        int d = ((int) g) % m;

        // System.out.println((int) g);
        // System.out.println((int) d);

        long ans = 1;
        long xx = x;
        while (n > 0) {
            if (n % 2 == 0) {
                xx=(xx%m*xx%m)%m;
                n = n / 2; // can use "<<"  instead of "/"... << is a bit shifter
            } else {
                ans=(ans*xx%m)%m;
                n = n - 1;
            }
        }
        System.out.println((int) (ans));  //1277562581
        System.out.println((int) (ans % m));
    }
}
