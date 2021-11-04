import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static BigInteger cycle2 (BigInteger num) {
        if (num.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ZERO;
        } else {
            BigInteger mod = num.mod(BigInteger.TWO);
            if (mod.compareTo(BigInteger.ZERO) == 1) {
                return BigInteger.ONE.add(cycle2(num.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)));
            } else {
                return BigInteger.ONE.add(cycle2(num.divide(BigInteger.TWO)));
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        BigInteger num = in.nextBigInteger();
        System.out.printf("Comes to one in "+ cycle2(num) + " steps");
    }
}

// test 40124643117