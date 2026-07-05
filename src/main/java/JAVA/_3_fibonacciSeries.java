package JAVA;

public class _3_fibonacciSeries {
    public static void main(String[] args) {
        int n=10,num1=0,num2=1;
        System.out.println("Fibonacci Series: " + num1 + " " + num2);

        for (int i=2;i<n;i++){
            int num3 = num1 + num2;//next number
            System.out.println("" + num3);//print next number
            num1 = num2;//update num1
            num2 = num3;//update num2
        }
    }
}
