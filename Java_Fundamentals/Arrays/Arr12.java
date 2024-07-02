import java.util.*;
public class Arr12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        System.out.println("Enter Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Middle Way: " + Arrays.toString(middleWay(arr1, arr2)));
    }

    private static int[] middleWay(int[] arr1, int[] arr2) {
        int[] middleWay = new int[2];
        if (arr1.length != 0 && arr2.length != 0) {
            middleWay[0] = arr1[1];
            middleWay[1] = arr2[1];
        } else {
            System.out.println("Enter Valid Arrays...");
        }
        return middleWay;
    }
}