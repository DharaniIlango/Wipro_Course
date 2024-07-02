import java.util.*;

public class FC_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        while(num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum*10 + digit;
            num/=10;
        }
        if(originalNum==reversedNum) {
            System.out.println(originalNum+" is a Palindrome");
        } else {
            System.out.println(originalNum+" is not a Palindrome");
        }
    }
}