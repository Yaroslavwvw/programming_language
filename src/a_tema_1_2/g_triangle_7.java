package a_tema_1_2;
import java.util.Scanner;
public class g_triangle_7 {

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a){
            System.out.print("YES");
        } else {
            System.out.print("NOPE");
        }
    }
}