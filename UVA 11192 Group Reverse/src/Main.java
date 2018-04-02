
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String toPrint="";
            int g = sc.nextInt();
            
            if(g==0)
                return;
            else
            {
              
            String s = sc.nextLine();
            s = s.trim();
             
            int length = s.length();
            int groups = length/g;
            int si = 0;
                int ei = groups;
            for(int i=0;i<g;i++)
            {
                
                String sub = s.substring(si, ei);
                si=ei;
                ei+=groups;
                StringBuilder builder = new StringBuilder(sub);
                toPrint+= builder.reverse().toString();
                
                
            }
                System.out.println(toPrint);
            }
           
        }
    }
}
