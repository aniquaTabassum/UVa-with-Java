
import java.util.Scanner;




public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            long number = sc.nextLong();
            String s = "";
            StringBuffer buffer;
            int i =0;
            do{
                i+=1;
                 s = String.valueOf(number);
                 buffer = new StringBuffer(s);             
                int reversed = Integer.valueOf(buffer.reverse().toString());
                number+=reversed;
            }while(String.valueOf(number).equals(new StringBuffer(String.valueOf(number)).reverse().toString())!=true);
            System.out.println(i+" "+number);
            test--;
        }
    }
}
