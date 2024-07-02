import java.util.*;

public class Arr05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] maxTwo = maxTwoElements(arr);
        int[] minTwo = minTwoElements(arr);

        System.out.println("Maximum Two : " + maxTwo[0] + "\t" + maxTwo[1]);
        System.out.println("Minimum Two : " + minTwo[0]+ "\t" + minTwo[1]);
    }

    public static int[] maxTwoElements(int[] arr){
        int[] maxTwo = new int[2];
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int temp;
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        maxTwo[0] = arr[0];
        maxTwo[1] = arr[1];
        return maxTwo;
    }

    public static int[] minTwoElements(int[] arr){
        int[] minTwo = new int[2];
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
        minTwo[0] = arr[0];
        minTwo[1] = arr[1];
        return minTwo;
    }
}