import java.util.*;

public class Arr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortedArray(arr);
    }

    private static void sortedArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int temp;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

}