package c_DZ_6_mart;
import java.util.Scanner;

public class ab_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; a > 0; i++) {
            b = b * (a % 10);
            a = a / 10;
        }
        System.out.println(b);
    }

}
