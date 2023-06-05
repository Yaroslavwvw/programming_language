package b_labaratornaya_2;

public class e_count_4 {
    public static void main(String[] args) {
        int k = 1234; int x =k;
        int s = 0;
        while (x != 0 ){
            s +=x%10;
            x /=10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }

}