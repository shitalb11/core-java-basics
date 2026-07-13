package JAVA;

import java.util.HashSet;

public class _9_LargestElelmentInArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        int largest = arr[0];

        for (int i=1;i< arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
