package JAVA;

public class _16_SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {12,34,50,5,77,78,98,0};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr){
            if (num>first){
                second = first;
                first=num;
            } else if (num > second && num != first) {
                second=num;
            }
        }
        System.out.println(second);//78
    }
}
