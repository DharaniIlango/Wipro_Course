import java.util.*;

public class FC_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNum = 0;
        while(num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum*10 + digit;
            num/=10;
        }
        System.out.println(reversedNum);
    }
}