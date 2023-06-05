package a_tema_1_2;
import java.util.Scanner;
public class c_max_3 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble(), a = sc.nextDouble(), b = sc.nextDouble();
        if (h > a) {
            if (h > b){
                System.out.print(h);
            }else {
                System.out.print(b);
            }
        } else {
            if (a > b){
                System.out.print(a);
            }else {
                System.out.print(b);
            }
        }
    }
}