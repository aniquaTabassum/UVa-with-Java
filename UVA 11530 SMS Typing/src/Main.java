
import java.util.Scanner;

 class Main {
     static int[] alphabets = new int[28];
    public static void main(String args[])
    {
     alphabets[1] = alphabets[4] = alphabets[7] = alphabets[10] = alphabets[13] = alphabets[16] = alphabets[20] = alphabets[23] = 1;
     alphabets[2] = alphabets[5] = alphabets[8] = alphabets[11] = alphabets[14] = alphabets[17] = alphabets[21] = alphabets[24] = 2;
     alphabets[3] = alphabets[6] = alphabets[9] = alphabets[12] = alphabets[15] = alphabets[18] = alphabets[22] = alphabets[25] = 3;
     alphabets[19] = alphabets[26] =4;
     int test = 0;
     
     Scanner sc = new Scanner(System.in);
     test = sc.nextInt();
     sc.nextLine();
     for(int j = 1; j<=test;j++)
     {
         
         int type = 0;
         String input = sc.nextLine();   
         int size = input.length();
         for(int i=0;i<size;i++)
         {
             
             int toCount =  input.charAt(i);
              
             if(toCount == 32)
                 type+=1;
             else
             {
                 if(toCount >64 && toCount<91)
                     toCount+=32;
             toCount = toCount - 96;
               
             type+= alphabets[toCount];
             }
         }
          System.out.println("Case #"+j+": "+type);
        
     }
       
     }
}
