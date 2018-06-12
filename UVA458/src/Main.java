
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        while( sc.hasNextLine())
        {
         input = sc.nextLine();
            String output = "";
            StringBuilder builder = new StringBuilder();
            int size = input.length();
            for(int i=0;i<size;i++)
            {
                char c= input.charAt(i);
                c-=7;
                System.out.print(c);
            }
            System.out.println();
        }
        
    }
}
