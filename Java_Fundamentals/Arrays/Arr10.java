import java.util.*;

public class Arr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(evenOdd(arr)));
    }

    private static int[] evenOdd(int[] nums) {
        int countE = 0;
        int countO = nums.length-1;
        int[] array = new int[nums.length];
         
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] % 2 == 0) {
            array[countE] = nums[i];
            countE++;
          }
          else {
            array[countO] = nums[i];
            countO--;
          }
        }
        return array;
      }  
}