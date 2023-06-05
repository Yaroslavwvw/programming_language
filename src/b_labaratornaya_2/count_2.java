package b_labaratornaya_2;
import java.util.Scanner;

public class count_2 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(),  g = sc.nextInt();
        int s = c;
        int n = 0;
        while (s <= g) {
            if (s % 3 == 0 && s % 5 != 0){
                n++;
            }
            s++;
        }
        System.out.print(n);
    }
}