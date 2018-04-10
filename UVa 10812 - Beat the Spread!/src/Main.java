
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        while(test>0)
        {
            double s = sc.nextDouble();
            double d = sc.nextDouble();
            if(d>s)
            {
                System.out.println("impossible");
                test--;
                continue;
            }
            double y = s-d;
            y/=2;
            if(java.lang.Math.ceil(y)!=y)
               {
                System.out.println("impossible");
                test--;
                continue;
            } 
          double  x = d+y;
          double low=0;
            double largest = (x>y)? x:y;
            if(largest == x)
                low = y;
            else
                low = x;
            System.out.println((long)largest+" "+(long)low);
            test--;
            
        }
    }
}
