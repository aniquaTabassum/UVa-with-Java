
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            if (n == 0) {
                return;
            } else {
                
                if(n==2)
                    System.out.println("Alice");
                else
                {
                    if(n%2==0)
                    {
                        System.out.println("Alice");
                        continue;
                    }
                    
                    double d = n&(n+1);
                    
                    if(d==0)
                        System.out.println("Bob");
                    else
                        System.out.println("Alice");
                }
            }
        }
    }
}
