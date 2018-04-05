
public class Main {

    public static void main(String[] args) {
        long[] ugly = new long[2000];
        ugly[0] = 1;
        int ftwo = 0;
        int fthree = 0;
        int ffive = 0;
        for (int i = 1; i < 1505; i++) {
            long minimum = Math.min(ugly[ftwo] * 2, Math.min(ugly[fthree] * 3, ugly[ffive] * 5));

            ugly[i] = minimum;
            if (minimum == ugly[ftwo] * 2) {
                ftwo++;
            }
            if (minimum == ugly[fthree] * 3) {
                fthree++;
            }
            if (minimum == ugly[ffive] * 5) {
                ffive++;
            }

        }
        System.out.println("The 1500'th ugly number is "+ugly[1499]);
    }
}
