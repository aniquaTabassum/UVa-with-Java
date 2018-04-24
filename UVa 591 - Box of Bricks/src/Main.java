
import java.util.Scanner;


 class Main {
    public static void main(String[] args)
    {
        int set=1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            
            int size = sc.nextInt();
            if(size == 0)
            {
                return;
            }
            else
            {
                int[] array = new int[size];
                int sum=0;
                for(int i=0;i<size;i++)
                {
                    array[i] = sc.nextInt();
                    sum+=array[i];
                }
                int height = sum/size;
                int moves=0;
                //System.out.println("height is "+height);
                for(int j=0;j<size-1;j++)
                {
                    //System.out.println("entered for");
                    int currentHeight = array[j];
                    if(currentHeight<height)
                    {
                        //System.out.println("current height is less than height");
                        int k = j+1;
                        while(currentHeight!= height)
                        {                          
                            //System.out.println("current height is "+currentHeight);
                            while(array[k] <= height)
                                k++;
                            //System.out.println("k is "+k);
                            while(currentHeight != height && array[k] != height)
                            {
                                currentHeight+=1;
                                array[k]-=1;
                                moves+=1;
                            }
                            //System.out.println("current height and height after modification is "+currentHeight+" "+array[k]);
                        }
                    }
                   else if(currentHeight>height)
                    {
                        //System.out.println("current height is greater than height");
                        int k = j+1;
                        while(currentHeight!= height)
                        {   
                            //System.out.println("current height is "+currentHeight);
                            while(array[k] >= height)
                                k++;
                            //System.out.println("k is "+k);
                            while(currentHeight != height && array[k] != height)
                            {
                                currentHeight-=1;
                                array[k]+=1;
                                moves+=1;
                            }
                             //System.out.println("current height and height after modification is "+currentHeight+" "+array[k]);
                        }
                    }
                    array[j] = currentHeight;
                }
                System.out.println("Set #"+set);
                set+=1;
                System.out.println("The minimum number of moves is "+moves+".");
                System.out.println("");
            }
        }
    }
}
