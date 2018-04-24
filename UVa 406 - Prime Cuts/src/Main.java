
import java.util.BitSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seive();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] array = new int[n];
            int i = 0;
            int length = 0;
            for (int j = 1; j <= n; j++) {
                //System.out.println("j is " + j);
                if (set.get(j) == false) {
                    //System.out.println("entered");
                    array[i] = j;
                    //System.out.println("assignment done");
                    i += 1;
                    length += 1;
                }
            }
            int temp = c;
            if (length % 2 == 0) {
                c = 2 * c;

            } else {
                c = (2 * c) - 1;
            }
            int flag = 0;
            if (c > length) {
                System.out.print(n + " " + temp + ": ");
                for (int j = 0; j < length; j++) {
                    System.out.print(array[j]);
                    if (j != length-1) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                System.out.println("");
                flag = 1;
            }
            if (flag == 1) {
                
                continue;
            }
            length -= c;
            length /= 2;
            System.out.print(n + " " + temp + ": ");
            for (int j = length; c > 0; j++, c--) {
                System.out.print(array[j]);
                if (c != 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            System.out.println("");
        }
    }
    static BitSet set = new BitSet(1000);

    public static void seive() {

        set.set(1, false);
        set.set(2, false);
        for (int i = 4; i <= 1000; i += 2) {
            set.set(i, true);
        }
        for (int i = 3; i < 32; i++) {
            for (int j = i * i; j < 1000; j = j + i + i) {
                set.set(j, true);
            }
        }
    }
}
