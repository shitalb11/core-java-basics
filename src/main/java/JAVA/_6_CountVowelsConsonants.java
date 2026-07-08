package JAVA;

import java.util.Locale;

public class _6_CountVowelsConsonants {
    public static void main(String[] args) {

        String str = "Automation";

        int vowels = 0, consonants=0;

        str = str.toLowerCase();

        for (char c: str.toCharArray()){

            if ("aeiou".indexOf(c) != -1){
                vowels++;
            } else if (Character.isLetter(c)) {
              consonants++;
            }
        }

        System.out.println("Vowels: "+ vowels + ", Consonants: " + consonants);
    }
}
