
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
       while(sc.hasNext())
       {
           
           String s = sc.nextLine();
           if(s.equals("*"))
               break;
           else if(s.equalsIgnoreCase("Hajj"))
           {
               System.out.println("Case "+i+": Hajj-e-Akbar");
               
           }
           else
           {
               System.out.println("Case "+i+": Hajj-e-Asghar");
           }
           i+=1;
       }
       
    }
}
