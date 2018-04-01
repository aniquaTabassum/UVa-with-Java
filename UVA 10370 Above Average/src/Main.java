
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        while (test > 0) {
            float sum = 0;
            int n = sc.nextInt();
            float[] array = new float[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextFloat();
                sum += array[i];

            }
            float average = sum / n;
            
            float count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > average) {
                    count++;
                }
            }
           
            float finalRes = (count * 100) / n;
            
            System.out.format("%.3f", finalRes);
            System.out.println("%");

            test--;
        }
    }
}
