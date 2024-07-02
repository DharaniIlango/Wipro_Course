import java.util.*;
public class Arr07 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89}; //given input array
        List<Integer> noDuplicateArray = new ArrayList<>();

        for(int i : arr){
            if(!noDuplicateArray.contains(i)){
                noDuplicateArray.add(i);
            }
        }
        System.out.println(Arrays.toString(noDuplicateArray.toArray()));
    }
}