public class Trailing0inFactorial {

    static int countTrailing0inFactorial(int number){
        int result=0;
        for(int i = 5; i <= number; i=i*5){   //TimeComplexity is log(n) as this loop runs 5^k <=number times
             result = number/i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number= 10;

        System.out.println(countTrailing0inFactorial(number));
    }
}
