import java.util.Scanner;

public class Seven_Task {
public static void main(String[]args){
    System.out.print("Введите количество :");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int rec = 0;
    for (int x=0; x<=n;x++){

        rec=rec+x;


    }
    System.out.println("Ваш результат :" + rec );
}

}