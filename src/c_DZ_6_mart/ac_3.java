package c_DZ_6_mart;
import java.util.Scanner;

public class ac_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        int sch = 0;
        for (int i = 1; a != 0; i++) {
            if (a > max) {
                sch = 1;
                max = a;
            } else {
                if (a == max) {
                    sch += 1;
                }
            }
            a = sc.nextInt();
        }
        System.out.println(sch);
    }
}
