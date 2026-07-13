package JAVA;

import java.util.HashSet;

public class _10_RemoveDuplicationFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
