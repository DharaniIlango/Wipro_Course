import java.util.*;

public class Arr02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Array Value: "+maxArrayValue(arr));
        System.out.println("Minimum Array Value: "+minArrayValue(arr));
    }

    public static int maxArrayValue(int[] arr){
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
        int maxValue = arr[arr.length-1];
        return maxValue;
    }

    public static int minArrayValue(int[] arr){
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
        int minValue = arr[0];
        return minValue;
    }
}