
import java.util.BitSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seive();
        int i = 1;
        while (sc.hasNext()) {

            int n = sc.nextInt();
            if (bits.get(n) == true) {
                System.out.println(n + " is not prime.");

            } else {
                int reversed = Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(n)).reverse()));
                if (bits.get(reversed) == false && n != reversed) {
                    System.out.println(n + " is emirp.");
                } else {
                    System.out.println(n + " is prime.");
                }
            }

        }
    }
    public static BitSet bits = new BitSet(1000000);

    public static void seive() {
        bits.set(2, false);
        bits.set(3,false);
        for (int i = 4; i < 1000000; i += 2) {
            bits.set(i, true);
        }
        for (int i = 3; i <= 1000; i += 2) {
            for (int j = i * i; j < 1000000; j = i + j + i) {
                bits.set(j, true);
            }
        }
    }
}
