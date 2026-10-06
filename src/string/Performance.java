package string;

public class Performance {
    public static void main(String[] args) {
        String series = "" ;
        // "" + anything concatenated
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            series += ch;
        }
        System.out.println(series);
    }
}
