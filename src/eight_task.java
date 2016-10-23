
public class eight_task {
    public static void main(String[] args) {
        for (int x = 1; x < 11; x++) {
            System.out.println(" ");
            for (int y = 1; y < 11; y++) {
                if (x > y) {
                    System.out.print("#\t");
                } else {
                    System.out.print(x * y + "\t");
                }
            }
        }
    }
}

