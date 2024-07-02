import java.util.*;

public class Arr09 {

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
        System.out.println(Arrays.toString(withoutTen(arr)));
        
    }

    public static int[] withoutTen(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        // Traverse the input array and copy non-10 values to the result array
        for (int i : arr) {
            if (i != 10) {
                result[index++] = i;
            }
        }
        // Remaining elements in the result array are already 0 by default
        // due to the array initialization with default values (0 for int).
        return result;
    }
}
