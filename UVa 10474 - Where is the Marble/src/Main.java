
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            if (n == 0 && q == 0) {
                return;
            } else {
                int[] array = new int[n];
                for (int j = 0; j < n; j++) {
                    array[j] = sc.nextInt();
                }
                Arrays.sort(array);
                int[] hash = new int[10001];
                for(int d=0;d<10001;d++)
                    hash[d] = -1;
                for(int d=0;d<n;d++)
                {
                    int toPut = array[d];
                    if(hash[toPut]==-1)
                    {
                        hash[toPut] = d+1;
                    }
                        
                }
                System.out.println("CASE# " + i + ":");
                for (int k = 0; k < q; k++) {
                    int toSearch = sc.nextInt();
                 
                    if (hash[toSearch] != -1) {
                      
                        System.out.println(toSearch + " found at " + hash[toSearch]);
                    } else {
                        System.out.println(toSearch + " not found");
                    }
                }
                i += 1;
            }
        }
    }
   
}
