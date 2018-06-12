
import java.util.Scanner;

class Main {

    public static long[] memory = new long[52];
    public static void main(String args[]) {
        memory[1] = 1;
        memory[2] = 2;
        Scanner sc = new Scanner((System.in));
        while (true) {
            int input = sc.nextInt();
            if(input == 0)
                return;
            else
            {
                
                System.out.println(pattern(input)); 
                
            }
            
        }
    }
    public static long pattern(int input)
    {
        if(memory[input]!=0)
            return memory[input];
        return  memory[input] = pattern(input-1)+pattern(input-2);
    }
}
