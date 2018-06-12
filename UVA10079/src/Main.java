
import java.util.Scanner;


class Main {
    public static void main(String args[])
    {
        
        long input = 0;
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            input = sc.nextLong();
            if(input<0)
                return;
            else
                System.out.println(((input*(input+1))/2)+1);
        }
    }
}
