package JAVA;

public class _26_FactorialOfNumber {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorial(num));
    }
    static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}
