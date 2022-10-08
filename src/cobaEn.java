import java.util.Scanner;

public class cobaEn {
    public static void main(String[] args) {
        String[] huruf = new String[26];
        Scanner in = new Scanner(System.in);

        for (char c = 'A'; c <= 'Z'; c++)
            huruf[c - 65] = String.valueOf(c);

        System.out.print("Masukkan Plain Text : ");
        String kata = in.nextLine();
        System.out.print("Masukkan Key-nya : ");
        int key = in.nextInt();

        String chiper = "";
        loop1: for (int a = 0; a < kata.length(); a++) {
            int index_plain = -1;
            for (int b = 0; b < huruf.length; b++) {
                index_plain = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;
                if (index_plain != -1) {
                    chiper += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }
            chiper += kata.charAt(a);
        }

        System.out.println("chiper Text : " + chiper);
    }
}