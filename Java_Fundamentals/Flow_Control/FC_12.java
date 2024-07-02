import java.util.*;

public class FC_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }

    public static void isPrime(int n) {
        int flag = 0;
        for(int i=2; i<n-1; i++){
            if(n%i!=0) {
                flag++;
                break;
            } else {
                break;
            }
        }
        if(flag!=0){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}