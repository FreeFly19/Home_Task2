 import  java.util.Scanner;
public class first_task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Введите пожалуйста любое отрицательное число: ");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.print("odd");
        }

    }
}
