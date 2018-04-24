
import java.util.Scanner;

 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int j = 1;
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            String toPrint = "";
            
            for(int i=0;i<s.length();i++)
            {
                char c = s.charAt(i);
                if(c == '"')
                {
                    if(j%2==0)
                    {
                        toPrint+='\'';
                        toPrint+='\'';
                        j+=1;
                    }
                    else
                    {
                        toPrint+='`';
                        toPrint+='`';
                        j+=1;
                    }
                }  
                else
                {
                    toPrint+=c;
                }
            }
            System.out.println(toPrint);
        }
    }
}
