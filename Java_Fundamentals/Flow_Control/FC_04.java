import java.util.*;

public class FC_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        char[] arr = new char[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        sortedArray(n, arr);
    }

    public static char[] sortedArray(int n, char arr[]) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i != (arr.length-1)){
                System.out.print(", ");
            }
        }
        return null;
    }
}