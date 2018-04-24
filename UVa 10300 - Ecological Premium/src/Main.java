
import java.math.BigInteger;
import java.util.Scanner;

 class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            int farmers = sc.nextInt();
            BigInteger sum=BigInteger.ZERO;
            while(farmers>0)
            {
                BigInteger sizeOfFiled = sc.nextBigInteger();
                BigInteger animals = sc.nextBigInteger();
                BigInteger friendliness = sc.nextBigInteger();
               //System.out.println("space animals and friends are "+sizeOfFiled+" "+animals+" "+friendliness);
                //System.out.println("sum is "+sum);
                BigInteger factor = sizeOfFiled.multiply(friendliness);
                
               sum = sum.add(factor);
                farmers --;
            }
            System.out.println(sum);
            test--;
        }
    }
}
