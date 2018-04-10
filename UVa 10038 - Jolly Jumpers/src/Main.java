
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] split = new int[n];
            for(int j=0;j<n;j++)
                split[j] = sc.nextInt();
            
            int i = 0;
            for (i = 0; i <= split.length - 2; i++) {
                if (split[i] != split[i + 1]) {
                    break;
                }
            }
            if (i == split.length - 1) {
                System.out.println("Jolly");
                continue;
            } else {
                Set set = new HashSet<Integer>();
                Set set2 = new HashSet<Integer>();
                int highest = 0;
                // Set set2 = new HashSet<Integer>();
               
                int two = 0;
                for (i = 0; i < split.length - 1; i++) {
                    int one = split[i];
                    two = (split[i + 1]);
                    int dif = java.lang.Math.abs(one - two);
                    //System.out.println("int1 is " + one + " int2 is " + two + " diff is " + dif);
                    set2.add(dif);
                    
                }
                //System.out.println("highest "+highest);
                for(i = 1;i<n;i++)
                    set.add(i);
                set.removeAll(set2);
                if(set.isEmpty() == true)
                    System.out.println("Jolly");
                else
                    System.out.println("Not jolly");
            }
        }
    }
}
