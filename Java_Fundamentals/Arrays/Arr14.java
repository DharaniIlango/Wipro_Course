public class Arr14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter exactly 9 integer numbers");
            return;
        }

        int[][] array = new int[3][3];
        int x = 0;

        // storing input to 2d array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Integer.parseInt(args[x++]);
            }
        }
        
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value

        // getting max of array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
