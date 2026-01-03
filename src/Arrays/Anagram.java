package Arrays;

import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count character frequencies
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        // Count characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }

        // Subtract character counts using the second string
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        // If all counts are zero, the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        if (isAnagram(str1, str2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
        }

        scanner.close();
    }
}
