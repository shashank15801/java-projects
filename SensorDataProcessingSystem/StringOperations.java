import java.util.Scanner;
public class StringOperations {
    public static void stringMenu(Scanner sc) {
        sc.nextLine();
        System.out.println("Enter system status message:");
        String msg = sc.nextLine();
        System.out.println("1. Reverse Message");
        System.out.println("2. Palindrome Check");
        System.out.println("3. Count Warning Vowels");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> System.out.println(" Reversed:" + reverse(msg));
            case 2 -> System.out.println(isPalindrome(msg)? "Palindrome" : "Not Palindrome");
            case 3 -> System.out.println("Vowel Count: " + countVowels(msg));
            default -> System.out.println("Invalid choice");

        }
    }
    static String reverse(String str) {
        System.out.println("Time Complexity: O(n)");
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }
    static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }
    static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        System.out.println("Time Complexity: O(n)");
        return count;
    }
}