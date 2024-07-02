import java.util.*;

public class Arr11 {
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
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        only14(arr);
    }

    private static void only14(int[] arr) {
        boolean only14 = true;
        for(int i= 0; i < arr.length; i++) {
            if(arr[i]!=1 && arr[i]!=4){
                only14 = false;
                break;
            }
        }
        if(only14){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}