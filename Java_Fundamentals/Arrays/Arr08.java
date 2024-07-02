import java.util.*;

public class Arr08 {
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
        conditionalSum(arr);
    }
    private static void conditionalSum(int[] arr){
        int sum = 0;
        int sixPos = -1;
        int sevenPos = -1;
        //lookup for the 6 and 7 in the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 6){
                sixPos = i;
            }
            if(arr[i] == 7){
                sevenPos = i;
            }
        }
        //case when 7 is not present
        if(sevenPos == -1) {
            sixPos = -1;
        }
        //calculate the sum
        for(int i = 0; i < arr.length; i++) {
            if(sixPos != -1 && i >= sixPos && i <= sevenPos){
                continue;
            }
            sum += arr[i];
        }

        System.out.println("The Expected Sum is "+sum);
    }
}