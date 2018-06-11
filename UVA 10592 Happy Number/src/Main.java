
import java.util.Scanner;

 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j = 1;j<=test;j++)
        {
           int sum=100;
            int evaluate = sc.nextInt();
            String s = String.valueOf(evaluate);
            while(sum>9)
            {
                sum=0;
            for(int i =0;i<s.length();i++)
            {
                int n = s.charAt(i) -'0';
                sum+=(n*n);
            }
            s = String.valueOf(sum);
            }
            if(sum == 1)
                System.out.println("Case #"+j+": "+evaluate+" is a Happy number.");
            else
                System.out.println("Case #"+j+": "+evaluate+" is an Unhappy number.");
            
        }
    }
}
