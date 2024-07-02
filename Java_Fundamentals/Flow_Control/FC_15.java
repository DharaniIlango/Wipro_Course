public class FC_15 {
    public static void main(String[] args) {
        if(args.length!=0){
            int num = Integer.parseInt(args[0]);
            for(int i=0; i<=num; i++){
                for(int j=0; j<=num; j++){
                    if(i>j) {
                        System.out.print("* ");
                    }
                    if(i==j){
                        System.out.println(" ");
                    }
                }
            }
        } else {
            System.out.println("Please enter an Integer...");
        }
    }
}