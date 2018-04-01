
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        sc.nextLine();
        while(test>0)
        {
            int flag = 0;          
            test--;
            String or = sc.nextLine();
            String dup = sc.nextLine();
            if(or.length() == dup.length())
            {
                flag = 1;
               for(int i=0;i<dup.length();i++)
               {
                   char c = or.charAt(i);
                  char d = dup.charAt(i);
                   if(c == 'a' || c == 'e' || c== 'i' || c=='o'||c=='u')
                   {
                       
                        if(d == 'a' || d == 'e' || d== 'i' || d=='o'||d=='u')
                        {
                            
                            
                        }
                        else
                        {
                            flag = 0;
                            break;
                        }                            
                   }
                   else
                   {
                       if(c != d)
                           flag = 0;
                      
                   }
               }
            }
            if(flag == 1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
