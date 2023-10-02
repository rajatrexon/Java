public class CountDigits {

    public static int counter(int x){
        int n=0;
        while(x>0){
            x=x/10;
            n++;
        }

        return n;


    }


    public static void main(String[] args) {
        int x=1;
        System.out.println(counter(x));
    }

    //Time Complexity is Theta(no.of digits in x)

}
