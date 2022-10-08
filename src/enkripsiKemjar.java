import java.util.Scanner;

public class enkripsiKemjar {

    public static void main(String[] args) {

        char[] kr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '.', '□', +'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', +'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String str = "";
        char[] Array1 = null;
        int geser = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Kalimat Yang Akan Di Enkripsi : ");
        Array1 = (in.next().toCharArray());
        System.out.print("Masukan Key : ");
        geser = in.nextInt();

        for (char c1 : Array1) {
            for (int i = 0; i <= 38; i++) {
                if (c1 == kr[i]) {
                    i = i + (geser);
                    if (i >= 39) {
                        i = i - 39;
                    }
                    c1 = kr[i];
                    str = str + c1;
                }
            }
        }

        System.out.println("hasil : " + str);

    }

}