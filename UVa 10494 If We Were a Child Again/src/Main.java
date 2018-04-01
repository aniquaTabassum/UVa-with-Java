
import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger numerator = sc.nextBigInteger();
            char c = sc.next().charAt(0);
            BigInteger denominator = sc.nextBigInteger();
            if(c=='/')
                System.out.println(div(numerator,denominator));
            else
                System.out.println(m(numerator,denominator));
        }
    }
    public static BigInteger div(BigInteger a, BigInteger b)
    {
        return a.divide(b);
    }
    public static BigInteger m(BigInteger a, BigInteger b)
    {
        return a.mod(b);
    }
}
