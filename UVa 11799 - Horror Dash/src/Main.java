
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1;i<=test;i++)
        {
            int n = sc.nextInt();
            int highest = Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                int current = sc.nextInt();
                if(current>highest)
                    highest = current;
                            
            }
            System.out.println("Case "+i+": "+highest);
        }
    }
}
