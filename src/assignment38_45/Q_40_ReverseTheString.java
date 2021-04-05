package assignment38_45;

import java.util.Scanner;

public class Q_40_ReverseTheString {
    public static void main(String[] args) {
        // getting input from user and putting that value in a String Builder;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder originalString = new StringBuilder(input.nextLine());

        System.out.println(reverseString(originalString));
    }

    public static StringBuilder reverseString(StringBuilder s){
        StringBuilder reverse = s.reverse();
        return reverse;
    }
}
