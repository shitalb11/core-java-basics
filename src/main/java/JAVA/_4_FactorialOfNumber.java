package JAVA;

public class _4_FactorialOfNumber {
    public static void main(String[] args) {
        int num = 3, factorial=1;
        for (int i=1;i<=num;i++){
            factorial=factorial+i;
        }
        System.out.println(factorial);
    }
}
