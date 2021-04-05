package assignment38_45;

import java.util.Locale;
import java.util.Scanner;

public class Q_38_isPalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to check if it is palindrome: ");
        System.out.println(isPalindrome(input.next()));
    }
    public static boolean isPalindrome(String original){
        boolean flag = true;
        String checkWord = original.toLowerCase(Locale.ROOT);
        for (int i = 0; i < checkWord.length(); i++) {
            System.out.println(checkWord.length());
            if(checkWord.charAt(i) != checkWord.charAt(checkWord.length()-i-1)){
                flag = false;
            }
        }
        return flag;
    }
}
