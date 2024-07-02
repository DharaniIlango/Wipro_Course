import java.util.*;

public class FC_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char newCh = Character.toUpperCase(ch);

        switch (newCh) {
            case 'R':
                System.out.println("Red");                
                break;
            case 'B':
                System.out.println("Blue");                
                break;
            case 'G':
                System.out.println("Green");                
                break;
            case 'O':
                System.out.println("Orange");                
                break;
            case 'Y':
                System.out.println("Yellow");                
                break;
            case 'W':
                System.out.println("White");                
                break;
            default:
                throw new AssertionError();
        }
    }
}