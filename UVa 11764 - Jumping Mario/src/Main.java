
import java.util.Scanner;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1;i<=test;i++)
        {
            int size = sc.nextInt();
            int highJump = 0;
            int lowJump = 0;
            int currentWall = sc.nextInt();
            for(int j=0;j<size-1;j++)
            {
                int next = sc.nextInt();
                if(next>currentWall)
                    highJump++;
                if(next<currentWall)
                    lowJump++;
                currentWall = next;
            }
            System.out.println("Case "+i+": "+highJump+" "+lowJump);
            
        }
    }
}
