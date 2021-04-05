package assignment38_45;

import java.util.Locale;
import java.util.Scanner;

public class Q_41_FindADuplicateLetterInAWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        findADuplicate(word);
    }
    public static void findADuplicate(String w){
        w = w.toLowerCase(Locale.ROOT);
        char[] arr = w.toCharArray();
        System.out.println("Duplicate letters are:");
        for ( int i = 0; i < arr.length; i++) {
            for (int  j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }

        }


    }
}
