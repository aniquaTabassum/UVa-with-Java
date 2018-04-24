
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int i=1;i<=test;i++)
        {
            int b =0;
            int w=0;
            int t=0;
            int a=0;         
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            for(int j=0;j<n;j++)
            {
                
                char c = s.charAt(j);
                //System.out.println("char is "+c);
                if(c=='B')
                    b+=1;
                else if(c=='W')
                    w+=1;
                else if(c=='A')
                    a+=1;
                else
                    t+=1;
                
            }
            if(n == a)
            {
                System.out.println("Case "+i+": ABANDONED");
                continue;
            }
            n-=a;
            if(b==n)
            {
                System.out.println("Case "+i+": BANGLAWASH");
                continue;
            }
            if(w==n)
            {
                 System.out.println("Case "+i+": WHITEWASH");
                continue;
            }
            else if(b>w)
              {
                 System.out.println("Case "+i+": BANGLADESH "+b+" - "+w);
                continue;
            } 
            else if(w>b)
            {
                 System.out.println("Case "+i+": WWW "+w+" - "+b);
                continue;
            }
            else
                System.out.println("Case "+i+": DRAW "+b+" "+t);
        }
               
    }
}
