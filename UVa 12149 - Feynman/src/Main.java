
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            if(n==0)
                return;
            else
            {
                long answer = ((n+n)+1)*(n+1)*n;
                
                answer/=6;
                System.out.println(answer);
            }
        }
    }
}
