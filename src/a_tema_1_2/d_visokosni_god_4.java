package a_tema_1_2;
import java.util.Scanner;

public class d_visokosni_god_4 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        if (h % 4 == 0) {
            System.out.print("YEA");
        } else {
            System.out.print("NOPE");
        }
    }
}