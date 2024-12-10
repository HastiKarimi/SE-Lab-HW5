import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    static int max_i = 10000;
    static int max_j = 2000;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }

    public static void eval(int i, int j, int k) {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void temp() {
        int [][] a = new int[max_i][max_j];
        for (int i = 0; i < max_i; i++) {
            for (int j = 0; j < max_j; j++) {
                a[i][j] =  i + j;
            }
        }
    }
}
