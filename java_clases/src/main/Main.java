package src.main;

public class Main {

    public static void main(String args[]) {
        for (int t = 0; t < 16; t++) {
            if (t % 2 == 0) {
                 int y = t / 2;
                 System.out.println("par " + y);
            }
            if (t % 5 == 0) {
                 int y = t * t;
                 System.out.println("div 5 " + y);
            }
            if (t % 9 == 0) {
                continue;
            }
            if (t % 2 != 0) {
                System.out.println("impar " + t);
            }
        }

    }
}
