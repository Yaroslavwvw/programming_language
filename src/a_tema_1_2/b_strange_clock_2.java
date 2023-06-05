package a_tema_1_2;
import java.util.Scanner;
public class b_strange_clock_2 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble(), m = sc.nextDouble(), x = sc.nextDouble();
        if ((h * 60 + m) * 60 >= x) {
            System.out.print("успел");
        } else {
            System.out.print("не успел");
        }
    }
}