import java.util.*;

public class FC_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String a = sc.nextLine();
        for(int i=0; i<a.length(); i++) {
            sum+=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        System.out.println(sum);
    }
}