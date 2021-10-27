import java.util.Scanner;
public class Main{
    static int cycle2 (int num) {
        if (num == 1) {
            return 0;
        } else {
            if (num % 2 > 0) {
                return 1 + cycle2(num * 3 + 1);
            } else {
                return 1 + cycle2(num / 2);
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.printf("Comes to one "+ cycle2(num));
    }
}