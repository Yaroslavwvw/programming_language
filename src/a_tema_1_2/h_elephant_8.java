package a_tema_1_2;
import java.util.Scanner;

class h_elephant_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (x1 + y1 == x2 + y2 | x1 - y1 == x2 - y2){
            System.out.println("СЛон бьёт фигуру");
        }
        else{
            System.out.println("Слон не бьёт фигуру");
        }
        sc.close();
    }
}