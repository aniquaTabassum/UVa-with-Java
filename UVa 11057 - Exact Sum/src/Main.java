
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int size = sc.nextInt();
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextLong();
            }
            //System.out.println("");
            Arrays.sort(array);
            long price = sc.nextLong();
            long dif = Integer.MAX_VALUE;
            long f = 0;
            long s = 0;
            int flag = 0;
            for (int i = 0; i < size; i++) {

                long temp = array[i];
                if (temp >= price) {
                    continue;
                }
                double divide = (double)price/2;
                //System.out.println("temp and divid is "+temp+" "+divide);
                if ((double)temp == divide) {
                    flag = 1;
                    //System.out.println("here");
                    System.out.println("Peter should buy books whose prices are " + temp + " and " + temp + ".");
                    break;
                }
                int el = binarySearch(array, 0, size - 1, (price - temp));
                if (el == -1) {
                    continue;
                } else {
                    // System.out.println("there");
                    long td = java.lang.Math.abs(temp - array[el]);
                    if (td < dif) {
                        dif = td;
                        f = (temp < array[el]) ? temp : array[el];
                        s = (temp > array[el]) ? temp : array[el];
                    }
                }
            }
            // System.out.println("ummm");
            if (flag == 0) {
                System.out.println("Peter should buy books whose prices are " + f + " and " + s + ".");
            }
            System.out.println("");
        }
    }

    static int binarySearch(long arr[], int l, int r, long x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
