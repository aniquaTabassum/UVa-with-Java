
import java.util.Scanner;


 class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test>0)
        {
            String toEvaluate = sc.nextLine();
            int length = toEvaluate.length();
            double check = java.lang.Math.sqrt(length);
            double checkFloor = java.lang.Math.floor(check);
            if( checkFloor== check)
            {
              
               int k=0;
                char[][] decode = new char[length][length];
                for(int i=0;i<check;i++)
                {
                    for(int j=0;j<check;j++)
                    {
                        decode[i][j] = toEvaluate.charAt(k);
                        k++;
                    }
                }
                for(int i=0;i<check;i++)
                {
                    for(int j=0;j<check;j++)
                    {
                        System.out.print(decode[j][i]);
                    }
                }
                System.out.println();
                
            }
            else
            {
               
                System.out.println("INVALID");
               
            }
            test--;
        }
                
    }
}
