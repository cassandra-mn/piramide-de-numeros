public class App {
    public static void main(String[] args) {
        int min = 1;
        int max = 5;

        while (max >= min) {
            for (int i = 1; i <= min; i++) {
                System.out.print(min);
            }
            
            System.out.println();
            min++;
        }
    }
}
