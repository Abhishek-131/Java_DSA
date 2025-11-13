package Simple;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 0 to 1000:");

        for (int number = 11; number <= 1000; number++) {
            if (isPalindrome(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;//256

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;//25,2,0
        }

        return originalNumber == reversedNumber;
    }
}
