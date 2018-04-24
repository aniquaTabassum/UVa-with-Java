
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double r = sc.nextDouble();
            double position = (x*x)+(y*y);
            position = java.lang.Math.sqrt(position);
            double longest = (r+position);
            double smallest = (r - position);
            System.out.format("%.2f %.2f",smallest,longest);
            System.out.println("");
            test--;
        }
    }
}
