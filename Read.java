import java.io.File;
import java.util.Scanner;
public class Read {
    static long l;
    static char c;
    static int i;
    static int j;
    static int t;
    static int ch;
    static int count;
    static int k;

    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        File file = new File("/home/a_lone_musk/Desktop/Essay.txt");
        Scanner sc = new Scanner(file);
        System.out.println(sc.nextLine());
        l = file.length();
        System.out.println(l);
        while (sc.hasNextLine()) {
            for (int t = 0; t <= l; t++) {
                ch = (int) c;
                for (i = 65, j = 97, k = 49; i <= 90 && j <= 122 && k <= 57; i++, j++, k++) {
                    if (ch != i || ch != j || ch != k) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}