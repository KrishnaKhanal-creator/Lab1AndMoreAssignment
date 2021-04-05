package assignment38_45;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_39_StringToSortForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A full name of SomeOne");
        String s = input.nextLine();
        sortForm(s);

    }

    public static void sortForm(String s) {
        int position = s.lastIndexOf(" ");
        String firstPart = s.substring(0,position);
        String secondPart = s.substring(position+1);

        String[] ss = firstPart.split(" ");
        for (String a : ss) {
            System.out.print(a.charAt(0) + ".");
        }
        System.out.println(secondPart);
    }
}


