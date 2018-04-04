
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
            System.out.println("PERFECTION OUTPUT");
            while(sc.hasNext())
            {
            double n = sc.nextDouble();
            if (n == 0) {
                System.out.println("END OF OUTPUT");
                return;
            }
             if (n == 1) {
                 System.out.format("%5d  DEFICIENT", 1);
                System.out.println("");
                continue;
            }
            double sum = 1;
            for (double i = 2; i <= (n / 2); i++) {
                double d = n / i;
                if (java.lang.Math.ceil(d) == d) {
                    sum += d;
                }
            }
            int m = (int) n;

            
            if (sum == n) {

                System.out.format("%5d  PERFECT", m);
                System.out.println("");
            } else if (sum < n) {

                System.out.format("%5d  DEFICIENT", m);
                System.out.println("");
            } else {

                System.out.format("%5d  ABUNDANT", m);
                System.out.println("");
            }

        }}
    }

