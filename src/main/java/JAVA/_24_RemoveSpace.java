package JAVA;

public class _24_RemoveSpace {
    public static void main(String[] args) {
        String str = "S H I T A L-B H O S A L E";
        String result = str.replaceAll("\\s+", "");
        System.out.println(result);
    }
}
