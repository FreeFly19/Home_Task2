import java.util.Scanner;

public class five_task {
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста интервал чисел :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите на какое число вы хотите поделить:  ");
        int r = scan.nextInt();
        System.out.println("На " + r + " без остатка делится: ");
        for (int x = 1; x <= n; x++) {
            if (x % r == 0) {
                System.out.println(x + " ");
            }
        }
    }
}
