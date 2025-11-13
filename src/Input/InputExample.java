package Input;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();  // Reads full line

        // Character Input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Reads first character of input

        // Integer Input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Float Input
        System.out.print("Enter a float: ");
        float fnum = sc.nextFloat();

        // Double Input
        System.out.print("Enter a double: ");
        double dnum = sc.nextDouble();

        // Boolean Input
        System.out.print("Enter a boolean (true/false): ");
        boolean bool = sc.nextBoolean();

        // Long Input
        System.out.print("Enter a long: ");
        long lnum = sc.nextLong(); //long integer value

        // Byte Input
        System.out.print("Enter a byte: ");
        byte bnum = sc.nextByte();

        // Short Input
        System.out.print("Enter a short: ");
        short snum = sc.nextShort();

        // Displaying Inputs
        System.out.println("\nInputs Received:");
        System.out.println("String: " + str);
        System.out.println("Character: " + ch);
        System.out.println("Integer: " + num);
        System.out.println("Float: " + fnum);
        System.out.println("Double: " + dnum);
        System.out.println("Boolean: " + bool);
        System.out.println("Long: " + lnum);
        System.out.println("Byte: " + bnum);
        System.out.println("Short: " + snum);

        // Close Scanner

    }
}
