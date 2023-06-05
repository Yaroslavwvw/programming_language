package a_tema_1_2;
import java.util.Scanner;
public class f_yravn_two_6 {
    public static void  main(String[] args) {
        double D = 0;
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        D = (b * b) - (4 * a * c);
        if (D != 0){
            if (D > 0){
                System.out.print(2);
            }else {
                System.out.print(0);
            }
        }else{
            System.out.print(1);
        }
    }
}