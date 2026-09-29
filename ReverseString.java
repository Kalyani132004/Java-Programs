// Write a Java program to reverse a string. 

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + reverse);

    }
}