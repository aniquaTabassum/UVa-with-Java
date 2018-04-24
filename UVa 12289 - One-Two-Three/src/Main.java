
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test>0)
        {
            String s = sc.nextLine();
            if(s.length() == 5)
                System.out.println("3");
            else
            {
                int t=0;
                int o=0;
               
                    if(s.charAt(0) == 't')
                        t+=1;
                    else
                        o+=1;
                    if(s.charAt(1) == 'w')
                        t+=1;
                    else
                        o+=1;
                    if(s.charAt(2) == 'o')
                        t+=1;
                    else
                        o+=1;
                    if(t>o)
                        System.out.println("2");
                    else
                        System.out.println("1");
                
            }
            test--;
        }
    }
}
