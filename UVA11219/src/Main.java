
import java.util.Scanner;
import java.util.regex.Pattern;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int j = 1; j <= test; j++) {
            //System.out.println();
            String current = sc.next();
        
            String born = sc.next();
            String splitCurrent[] = current.split("\\/");
            String splitBorn[] = born.split("\\/");
            int[] currentInt = new int[3];
            int[] bornInt = new int[3];
            for (int i = 0; i < splitCurrent.length; i++) {
                currentInt[i] = Integer.parseInt(splitCurrent[i]);
            }
            for (int i = 0; i < splitBorn.length; i++) {
                bornInt[i] = Integer.parseInt(splitBorn[i]);

            }

            if (bornInt[2] < currentInt[2]) {

                int age = currentInt[2] - bornInt[2];

                if (bornInt[1] > currentInt[1]) {
                    age--;
                } else if ((bornInt[1] == currentInt[1]) && bornInt[0] > currentInt[0]) {
                    age--;
                }
                if (age > 130) {
                    System.out.println("Case #" + j + ": Check birth date");
                } else {
                    System.out.println("Case #" + j + ": " + age);
                }

            } else {

                if (bornInt[2] == currentInt[2]) {

                    if (bornInt[1] > currentInt[1]) {
                        System.out.println("Case #" + j + ": Invalid birth date");
                    } else {

                        if (bornInt[1] == currentInt[1] && bornInt[0] > currentInt[0]) {
                            System.out.println("Case #" + j + ": Invalid birth date");
                        } else {
                            System.out.println("Case #" + j + ": 0");
                        }

                    }
                } else {
                    System.out.println("Case #" + j + ": Invalid birth date");
                }
            }

        }
    }
}
