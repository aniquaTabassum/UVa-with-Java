
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int count = 0;
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            int k = n;
            while (k != 1) {
                int t = 1;
                for (int j = 0; j < k - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        count++;
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        t = j + 1;
                    }

                }
                k = t;

            }
         
            System.out.println("Optimal train swapping takes "+count+" swaps.");
            test--;
        }
    }
}
