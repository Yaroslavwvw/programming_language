package b_labaratornaya_2;
import java.util.Scanner;

public class a_scan_namber_from_keyboard_1 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int s = 0;
        int n = 0;
        while (c != 0) {
            n = n + 1;
            s = s + c;
            c = sc.nextInt();
        }
        System.out.print(s / n);
    }
}
