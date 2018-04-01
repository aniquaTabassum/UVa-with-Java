
import java.util.Scanner;


 class Main {
    static int[] array = new int[1000001];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true)
        {
            num = sc.nextInt();
            if(num ==0)
                return;
            System.out.println("f91("+num+") = "+f91(num));
        }
    }
    public static int f91(int n)
    {
        if(array[n]!=0)
         return array[n];
        else if(n>=101)
            return array[n] = n-10;
        else 
            return array[n] = f91(f91(n+11));
    }
}
