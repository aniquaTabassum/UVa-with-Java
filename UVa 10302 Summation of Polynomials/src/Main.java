
import java.math.BigInteger;
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        BigInteger n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            n = sc.nextBigInteger();
            BigInteger d = n.multiply(n.add(BigInteger.ONE));
            d = d.divide(BigInteger.ONE.add(BigInteger.ONE));
            System.out.println(d.pow(2));
        }
    }
}
