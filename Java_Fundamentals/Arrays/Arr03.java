import java.util.*;

public class Arr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int searchElement = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
            }
        }
        if(index!=-1) {
            System.out.println(index);
        } else {
            System.out.println(index);
        }
    }
}