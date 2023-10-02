public class Pallindrome {

    public static int reverse(int x){
      int rev=0;
     while(x!=0){
        rev = rev*10+x%10;
       x= x/10;
     }
      return rev;
    }

    public static void main(String[] args) {
        int x = 1112111;

        if(reverse(x)==x){
            System.out.println("No. is Pallindrome");
        }else{
            System.out.println("No. is not Pallindrome");
        }
    }

    //Time Complexity is Theta(no.of digits in x)
}
