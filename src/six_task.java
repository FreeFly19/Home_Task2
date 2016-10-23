
public class six_task {
    public static void main(String[] args) {
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                int c = y * x;
                System.out.printf("%4d", c);
            }
            System.out.println();
        }
    }
}
