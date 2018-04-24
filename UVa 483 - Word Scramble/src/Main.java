
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            String[] split = s.split("\\ ");
            int size = split.length;
            for(int i=0;i<size;i++)
            {
                System.out.print(new StringBuilder(split[i]).reverse());
                //if(i!=size-1)
                    System.out.print(" ");
            }
            System.out.println("");
            
        }
    }
}
