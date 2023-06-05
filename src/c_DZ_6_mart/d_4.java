package c_DZ_6_mart;

import java.util.Scanner;

public class d_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int summ = 0;
        for (int i = 0; i < a; i++) {
            summ = summ + sc.nextInt();
            String b = new String(sc.next());
        }
        System.out.println(summ / a);
    }
}
