
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int[] array = new int[3];
            for(int i=0;i<3;i++)
            {
                array[i] = sc.nextInt();
                
            }
            if(array[0] == array[1])
            {
                if(array[0] == array[2])
                    System.out.println("*");
                else
                    System.out.println("C");
            }
            else
            {
                if(array[1] == array[2])
                    System.out.println("A");
                else
                    System.out.println("B");
            }
        }
    }
}
