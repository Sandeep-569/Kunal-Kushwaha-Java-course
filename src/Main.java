
public class Main {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if (a.charAt(start) < 97 || a.charAt(start) > 122) {
                start++;
                continue;
            }
            if(a.charAt(end) < 97 || a.charAt(end) > 122){
                end--;
                continue;
            }
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
            else if(a.charAt(start) == a.charAt(end)){
                start++;
                end--;
            }

        }
        return true;
    }

}