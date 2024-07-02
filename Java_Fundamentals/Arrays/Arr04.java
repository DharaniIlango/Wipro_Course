import java.util.*;

public class Arr04 {
    public static void main(String[] args) {
        System.out.println("ASCII Value of digits 48-57");
        System.out.println("ASCII Value of UpperCase Character 65-90");
        System.out.println("ASCII Value of LowerCase Character 97-122");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char)arr[i]+"\t");
        }
    }
}