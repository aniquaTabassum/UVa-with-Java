
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = n;
            while (n >= 3) {
                a = a + (n / 3);
                n = (n / 3) + (n % 3);
            }
            if (n == 2) {
                a++;
            }
            System.out.println(a);
        }
        return;
    }
}


