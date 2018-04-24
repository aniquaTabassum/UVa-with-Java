
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            long lower = sc.nextLong();
            long upper = sc.nextLong();
            int max = Integer.MIN_VALUE;
            long value = 0;
            for (long i = lower; i <= upper; i++) {
                int divisors = 0;
                //System.out.println("for "+i);
                double root = java.lang.Math.sqrt(i);
                  {
                    for (int j = 1; j <= root; j++) {
                        
                         if (i % j == 0) {
                            //System.out.println("divisor is "+j);
                            divisors += 2;
                        }
                    }
                } /*else {
                    for (int j = 1; j <= java.lang.Math.sqrt(i); j++) {
                        {
                        if (i % j == 0) {
                            //System.out.println("Divisor is "+j);
                            divisors += 2;
                        }}
                    }
                }*/
                if(root == java.lang.Math.ceil(root))
                      divisors-=1;
                    if (divisors > max) {
                    max = divisors;
                    value = i;
                }
            }
            System.out.println("Between " + lower + " and " + upper + ", " + value + " has a maximum of " + max + " divisors.");
            test--;
        }
    }
}
