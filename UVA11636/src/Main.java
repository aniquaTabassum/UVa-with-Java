
import java.util.Scanner;

 class Main {
    public static void main(String args[])
    {
        int total;
        int current = 1;
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
        int count = 0;
        int i=1;
        while(total>-1)
        {
            count = 0;
            current = 1;
            while(current<total)
            {
                current+=current;
                count++;
            }
              System.out.println("Case "+i+": "+count);
              i++;
                total = sc.nextInt();
        }
      
      
    }
}
