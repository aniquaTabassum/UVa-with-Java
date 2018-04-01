
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = String.valueOf(i + i);
        }
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test > 0) {

            String doubleValue = "";
            String singleValue = "";
            String num1 = sc.nextLine();
            String[] sp = num1.split("\\ ");
            StringBuilder builder = new StringBuilder();

            for (String num : sp) {
                builder.append(num);
            }
            String num = builder.toString();
            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (c == ' ') {
                    continue;
                }

                if (i % 2 == 0) {
                    doubleValue += array[num.charAt(i) - '0'];

                } else {
                    singleValue += c-'0';

                }

            }
           
            int dv = 0;
            int sv = 0;
            for (int i = 0; i < doubleValue.length(); i++) {
                dv += doubleValue.charAt(i) - '0';
            }
            
            for (int i = 0; i < singleValue.length(); i++) {
                sv += singleValue.charAt(i) - '0';
            }
            
            String fin = String.valueOf(sv + dv);
            
            if (fin.charAt(fin.length() - 1) == '0') {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            test--;
        }
    }
}
