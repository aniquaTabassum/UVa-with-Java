
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            if(s.equals("0"))
                return;
            long length = s.length();
            long decimal = 0;
            double position = 1;
            for(int i= (int)length-1;i>=0;i--)
            {
                char c = s.charAt(i);
                if(c=='0')
                {
                    position+=1;
                    continue;
                }
                if(c=='1')
                {
                    double power = java.lang.Math.pow(2, position);
                    position+=1;
                    power-=1;
                    decimal+=power;
                }
                if(c=='2')
                    {
                    double power = java.lang.Math.pow(2, position);
                    position++;
                    power-=1;
                    power+=power;
                    decimal+=power;
                }
            }
            System.out.println(decimal);
        }
    }
}
