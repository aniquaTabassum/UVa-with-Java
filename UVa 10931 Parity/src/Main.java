
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int count = 0;
            int input = sc.nextInt();
            if(input ==0)
                return;
            int a;
            String x="";
            int n = input;
             while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x += + a;
            n = n / 2;
        }
             
             StringBuilder builder = new StringBuilder(x);
             x=builder.reverse().toString();
             System.out.println("The parity of "+x+" is "+count+" (mod 2).");
        }
    }
}
