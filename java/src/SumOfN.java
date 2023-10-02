public class SumOfN {
    /*sum of n natural numbers
    Input : n = 3
    Output: 1+2+3=6
     */

    public static int sum(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        int n =5;

        System.out.println(sum(n));


    }

}
