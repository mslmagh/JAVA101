public class Palindrome {
    public static void main(String[] args) {

        String word = "radar";

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        StringBuilder reversed = new StringBuilder(str).reverse();

        return str.equals(reversed.toString());
    }
}
