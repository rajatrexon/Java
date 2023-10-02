public class ArrayRotation {
    public static void main(String[] args) {
       int[] arr ={1,2,3,4,5,6,7};

       int[] arr2 = new int[7];

       int n = arr.length;

       int k = 8;
         k = k%n;

       for(int i = 0 ; i<7 ; i++){
           int newIndex = (i +k)%n;
           arr2[newIndex] = arr[i];
       }

       for(int i = 0 ; i<7 ;i++){
           System.out.print(arr2[i]);
       }

    }
}