
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String n1 = sc.next();
            String n2 = sc.next();
            if(n1.equals("0") && n2.equals("0"))
                return;
            
             if(n1.length()!=n2.length())
            {
                
                int diff = n1.length()>n2.length() ? n1.length() - n2.length() : n2.length()-n1.length();
                String difs ="";
                for(int i=0;i<diff;i++)
                    difs+="0";
                if(n1.length()<n2.length())
                    n1 = difs+n1;
                else
                    n2 = difs+n2;
            }
            int count = 0;
            StringBuilder sb = new StringBuilder(n2);
            for(int i = (n1.length() -1);i>=0;i--)
            {
                int c1 = n1.charAt(i) -'0';
                int c2 = sb.charAt(i) - '0';
                if(c1+c2 >9)
                {
                    count++;
                    if(i!=0)
                    {
                    char c3 = sb.charAt(i-1);
                    c3+=1;
                    sb.setCharAt(i-1, c3);
                    }
                }
            }
            if(count ==0)
                System.out.println("No carry operation.");
            else if(count == 1)
                System.out.println("1 carry operation.");
            else
            System.out.println(count+" carry operations.");
        }
    }
}
