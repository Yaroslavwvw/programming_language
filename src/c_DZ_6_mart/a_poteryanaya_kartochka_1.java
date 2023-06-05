package c_DZ_6_mart;
import java.util.Scanner;


public class a_poteryanaya_kartochka_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 1;

        for (int i = 1; i <= x; i++) {
            a = a * i;
        }
        for (int i = 1; i < x; i++) {
            int c = sc.nextInt();
            a = a / c;
        }
        System.out.println(a);
    }
}
