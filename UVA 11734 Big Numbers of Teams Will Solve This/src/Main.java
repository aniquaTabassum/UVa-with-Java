
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= test; i++) {
            String contestant = sc.nextLine();
            String judge = sc.nextLine();
            String[] c = contestant.split("\\ ");
            String[] j = judge.split("\\ ");
            int js = judge.length();
            int cs = contestant.length();
            StringBuilder builder = new StringBuilder();

            for (String apC : c) {
                builder.append(apC);
            }
            String apC = builder.toString();
            StringBuilder builder1 = new StringBuilder();
            for (String apJ : j) {
                builder1.append(apJ);
            }

            String apJ = builder1.toString();
            if (apC.equals(apJ) && js == cs) {
                System.out.println("Case " + i + ": Yes");
            } else if (!apC.equals(apJ)) {
                System.out.println("Case " + i + ": Wrong Answer");
            } else {
                System.out.println("Case " + i + ": Output Format Error");
            }
        }
    }
}
