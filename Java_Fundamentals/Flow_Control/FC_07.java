
import java.util.Scanner;


public class FC_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals(str.toUpperCase())){
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }
    }
}