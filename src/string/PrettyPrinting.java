package string;

public class PrettyPrinting {
    public static void main(String[] args) {
        //%c - Character
        //%d - Decimal number (base 10)
        //%e - Exponential floating-point number
        //%f - Floating-point number
        //%i - Integer (base 10)
        //%o - Octal number (base 8)
        //%s - String
        //%u - Unsigned decimal (integer) number
        //%x - Hexadecimal number (base 16)
        //%t - Date/time
        //%n - Newline
        float a = 453.23423f;
        System.out.printf("Formatted number: %.2f ", a);//453.23
        System.out.printf("pie: %.3f",Math.PI);//3.142
    }
}
