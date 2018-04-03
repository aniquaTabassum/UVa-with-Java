
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int test = 0;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        sc.nextLine();
        for (int j = 1; j <= test; j++) {
            String s = sc.nextLine();
            String toPrint = "";
            String o ="";
            char c = 0;
            char in=0;
            for(int i =0;i<s.length();i++)
            {
               
                if(Character.isLetter(s.charAt(i)))
                {
                    if(i!=0)
                    {                      
                        int occurence = Integer.parseInt(o);
                        for(int k=0;k<occurence;k++)
                        {
                            
                            toPrint+=c;
                        }
                        o="";
                         c = s.charAt(i);
                    }
                    else
                     c = s.charAt(i);  
                    
                }
                else if(Character.isDigit(s.charAt(i)))
                {
                    in = s.charAt(i);
                    o+=in;
                }
            }
            int currence = Integer.parseInt(o);
            for(int k=0;k<currence;k++)
                        {
                            
                            toPrint+=c;
                        }
            System.out.println("Case "+j+": "+ toPrint);
        }

    }
}
