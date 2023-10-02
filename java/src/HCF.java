public class HCF {

    /**
     Euclid theorem says that if we want to find the gcd of two numbers a and b where b>a
     then if we do (b-a) until a==b  will be the gcd of original a and b.
     in Optimised version instead of doing (b-a) we do b%a
     */
    static int gcd(int x, int y) {

        while (x != y) {
            if (x < y) {
                y = y - x;
            } else {
                x = x - y;
            }
        }
            return y;
    }


    static int gcd2(int x, int y) {
        if(y==0){
            return x;
        }
        return gcd2(y,x%y);
    }

    public static void main(String[] args) {
        int x= 4;
        int y= 6;

        System.out.println(gcd2(x, y));
    }
}
