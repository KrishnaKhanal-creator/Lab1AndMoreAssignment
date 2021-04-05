package assignment38_45;

import java.util.Scanner;

public class Q_43_TrapTheException {
    public static void main(String[] args) {
        trapExceptionDividedBy0();
        trapOutOfIndexValue();


    }
    public static void trapExceptionDividedBy0(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = input.nextInt();
        try {
            int div = num1/num2;
        }catch (ArithmeticException ae){
            System.out.println("Trap Successfully inside Catch i.e: " + ae);
        }
    }
    public static void trapOutOfIndexValue(){
        String[] arr = new String[4];

        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Trap Successfully inside Catch i.e: " + aie);
        }
    }

}

