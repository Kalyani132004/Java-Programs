// Write a Java program to check whether a string is a palindrome or not.

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.err.println("Palindrome String");
        } else {
            System.err.println("Not Palindrome String");
        }
        sc.close();
    }
}
