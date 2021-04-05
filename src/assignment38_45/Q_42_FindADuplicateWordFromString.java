package assignment38_45;

import java.util.Locale;
import java.util.Scanner;

public class Q_42_FindADuplicateWordFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = input.nextLine();

        isDuplicate(s);

    }
    public static void isDuplicate(String s){
        int count=1;
        s= s.toLowerCase(Locale.ROOT);
        String[] arr = (s.split(" "));
        System.out.println("Duplicate words are: ");
        for (String a : arr)
            for ( int i = 0; i < arr.length; i++) {
                for ( int j = i+1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])){
                        System.out.println(arr[i]);
                        count++;
                        break;
                    }
                }

            }


    }
}
