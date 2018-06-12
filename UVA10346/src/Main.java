
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        long k = 0;

        while (sc.hasNext()) {
            n = sc.nextLong();
            k = sc.nextLong();
            long prev = 1;
            long p = 0;
            long c = n;
            long b = k;
            while (prev != p) {
                prev = c / b;
                c += prev;
                p = c / b;
                System.out.println("p is " +p);

                if (prev != p) {
                    c += (p - prev);
                } else {
                    break;
                }
            }
                System.out.println(c);
            
        }
    }
}
