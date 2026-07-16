package JAVA;

public class _13_ReverseNumber {
    public static void main(String[] args) {

        int num = 12345, reversed = 0;

        while (num != 0){
            reversed = reversed * 10 + num % 10;
            num=num/10;
        }
        System.out.println(reversed); //54321
    }
}
