package a_tema_1_2;
import java.util.Scanner;

class I_kotleti_9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int d = 2*m;
        int a = n % k;
        int b = n - a;
        int c = b*d + a*d;
        System.out.println(c);
        sc.close();
    }
}