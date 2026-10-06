package string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        int n = str.length();
        int end = n-1;
        boolean isPalindrome = true;
        for (int i = 0; i <=n/2; i++) {
            if(str.charAt(i) != str.charAt(end)) {
                 isPalindrome = false;
                 break;
            }
            end--;
        }
        System.out.println(isPalindrome);
    }
}
