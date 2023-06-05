package a_tema_1_2;
import java.util.Scanner;
public class e_yravn_one_5 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (a == 0){
            System.out.print("inf");
        }else{
            System.out.print(b * (-1) / a);
        }

    }
}