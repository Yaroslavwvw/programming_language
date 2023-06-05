package d_labaratornaya_4;
import java.util.Scanner;

public class bolshe_menshe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int theNumber = (int) (Math.random() * 100 + 1);
            System.out.println(theNumber);
            System.out.println("Вы хотите сыграть в игру?");
            String b = sc.next();
            if ("да".equals(b)) {
                System.out.println("Ввидите число от 1 до 100:");
                int a = sc.nextInt();
                while (a != theNumber) {
                    if (a > theNumber) {
                        System.out.println("Введённое число больше загаданного, введите новое число:");
                        a = sc.nextInt();
                    } else {
                        if (a < theNumber) {
                            System.out.println("Введённое число меньше загаданного, введите новое число:");
                            a = sc.nextInt();
                        }
                        System.out.println("Вы отгадали число.");
                    }

                }
            } else {
                System.out.println("конец");
                break;
            }
        }
    }
}