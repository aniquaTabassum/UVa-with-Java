
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                return;

            }
            
            
            int i=0,j=0,flag =0;
            for(i=1;i<60;i++)
            {
                for(j=0;j<i;j++)
                {
                    if((i*i*i) - (j*j*j) == n)
                    {
                        flag = 1;
                        break;
                    }
                    
                }
                if(flag == 1)
                        break;
            }
            if(i == 60 || j==0)
                System.out.println("No solution");
            else
                System.out.println(i+" "+j);
            
        }
    }
}
