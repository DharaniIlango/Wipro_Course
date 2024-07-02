import java.util.*;

public class FC_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}