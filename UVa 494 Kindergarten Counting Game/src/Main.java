
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String line = sc.nextLine();
            line = line.replaceAll("[^A-Za-z ]", " ");
            int count = 0;
            String[] words = line.split("\\ ");
            for(int i=0;i<words.length;i++)
            {
                words[i] = words[i].trim();
                if(words[i].equals(""))
                    continue;
                else
                {//System.out.print(words[i]+" ");
                count++;
                }
            }
           
            System.out.println(count);
        } 
           
    }
}
