package b_labaratornaya_2;
import java.util.Scanner;

public class f_morning_run_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat(), y = in.nextFloat();
        int k = 1;
        while (x <= y) {
            x *= 1.15;
            k++;
        }
        System.out.println(k);
    }
}