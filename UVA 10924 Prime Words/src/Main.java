
import java.util.BitSet;
import java.util.Scanner;

class Main {

    static BitSet bits = new BitSet(1040);

    public static void main(String[] args) {
       
        setPrimes();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sum = 0;
            String input = sc.nextLine();
            int size = input.length();
            for (int i = 0; i < size; i++) {
                char c = input.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    sum += c - 96;
                }
                if (c >= 'A' && c <= 'Z') {
                    sum += c - 38;
                }
            }
            
            if(bits.get(sum) == true)
            {
                System.out.println("It is not a prime word.");
            }
            else
                System.out.println("It is a prime word.");
        }
    }

    public static void setPrimes() {
        bits.set(0,true);
       
        for (int i = 2; i <= (int) java.lang.Math.sqrt(1040); i++) {
            for (int j = i + 1; j <= 1042; j++) {
                if (bits.get(j) == true) {
                    continue;
                }

                if (j % i == 0) {
                    bits.set(j,true);

                }
            }
        }
       
    }

}
