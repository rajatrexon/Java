public class Factorial {

   static int factorial(int number){
        int factorial =1;
        while(number>0) {
            factorial = factorial*number;    /* Time Complexity = Theta(n)*/


            number--;
        }
        return factorial;
    }

    static int factorial2(int number){
       int result= 1;                     /* Time Complexity = Theta(n)*/

       for (int i=2;i<=number;i++){
           result=result*i;

       }
       return result;
    }


    static int  factorial3(int number){   /**  T(n)=T(n-1)+Theta(1)   TimeComplexity =Theta(n) but this will
                                          consume auxiliary space of Theta(n) due to stack formation **/
       if(number==0){
           return 1;
       }

       return number*factorial3(number-1);

    }

    public static void main(String[] args) {
        int number = 5;

        System.out.println(factorial3(number));
    }
}
