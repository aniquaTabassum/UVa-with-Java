
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


 class Main {
    static long previous = 1;
   public static void count(long i,long j)
    {
        long l;
        long s;
        if(i<j)
        {l = j;
        s=i;
        }
        
       else
            {l = i;
        s=j;
        }
        for(long start = s;start<=l;start++)
        {
            long count=1;
            long temp = start;
            while(temp!=1)
            {
                if(temp%2==0)
                    temp/=2;
                else
                    temp = (3*temp)+1;
                 count = count+1;           
            }
            
            if(count > previous)
            {
                previous = count;
               
            }
        }
       
         System.out.println(i+" "+j+" "+previous);
         previous = 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long i;
            long j;
            try{
                
             i = sc.nextLong();
             j = sc.nextLong();
             count(i,j);
            
            }catch(Exception e)
            {
                return;
            }
            
        }
      
    }
}
