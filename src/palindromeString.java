public class palindromeString {
    public static void main(String[] args) {
        String text = "madam";
        boolean isPalindrome = true;

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
