
import java.util.Scanner;


 class Main {
    public static long calculate(long number)
    {
        number*=567;
        number/=9;
        number+=7492;
        number*=235;
        number/=47;
        number-=498;
        return number;
    }
    public static long ten(long findTen)
    {
        
        findTen = findTen/10;
        findTen = findTen%10;
        return findTen;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            long toCalculate = sc.nextLong();
            long findTen = calculate(toCalculate);
            findTen = ten(findTen);
            if(findTen<0)
                findTen = findTen*(-1);
            System.out.println(findTen);
            test--;
        }
    }
}
