import java.util.*;

public class FC_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gender: \"Male\" or \"Female\" ");
        String gender = sc.nextLine();
        System.out.println("Enter Age (Between 1 and 100): ");
        int age = sc.nextInt();
        if ((gender.equals("Male"))){
            if(age>=1 && age<=58){
                System.out.println("The Percentage of Interest is 8.4%");
            } else {
                System.out.println("The Percentage of Interest is 10.5%");
            }
        } else {
            if(age>=1 && age<=58){
                System.out.println("The Percentage of Interest is 8.2%");
            } else {
                System.out.println("The Percentage of Interest is 9.2%");
            }
        }
    } 
}