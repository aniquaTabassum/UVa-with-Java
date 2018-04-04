
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        int i=1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            double n = sc.nextDouble();
            if(n==0)
                return;
            else
            {
                n+=n;
                n=(n+n+n+n);
                n+=9.0;
                double root = java.lang.Math.sqrt(n);
                root = -3-root;
                root/=2;
                root*=(-1);
                root = java.lang.Math.ceil(root);
                System.out.println("Case "+i+": "+(int)root);
                i++;
            }
        }
    }
}
