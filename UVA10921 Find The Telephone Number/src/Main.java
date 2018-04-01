
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<Character> two = new HashSet<Character>();
            Set<Character> three = new HashSet<Character>();
            Set<Character> four = new HashSet<Character>();
            Set<Character> five = new HashSet<Character>();
             Set<Character> six = new HashSet<Character>();
            Set<Character> seven = new HashSet<Character>();
            Set<Character> eight = new HashSet<Character>();
            Set<Character> nine = new HashSet<Character>();
            two.add('A');
            two.add('B');
            two.add('C');
            three.add('D');
            three.add('E');
            three.add('F');
            four.add('G');
            four.add('H');
            four.add('I');
            five.add('J');
            five.add('K');
            five.add('L');
            six.add('M');
            six.add('N');
            six.add('O');
            seven.add('P');
           seven.add('Q');
            seven.add('R');
            seven.add('S');
            eight.add('T');
            eight.add('U');
            eight.add('V');
            nine.add('W');
            nine.add('X');
            nine.add('Y');
            nine.add('Z');
        while(sc.hasNext())
        {
            
           String input = sc.nextLine();
           String output = "";
           StringBuilder builder = new StringBuilder();
           int size = input.length();
           for(int i =0;i<size;i++)
           {
               char c = input.charAt(i);
               if(c == '1' || c== '0')
               {
                   output = builder.append(c).toString();
                   continue;
               }
               if(c< 'A' || c >'Z')
               {
                   output = builder.append(c).toString();
                   continue;
               }
               if(c>='A' || c<='Z')
               {
                   if(two.contains(c))
                   {
                       output = builder.append("2").toString();
                   continue;
                   }
                   if(three.contains(c))
                   {
                       output = builder.append("3").toString();
                   continue;
                   }
                   if(three.contains(c))
                   {
                       output = builder.append("3").toString();
                   continue;
                   }
                   if(four.contains(c))
                   {
                       output = builder.append("4").toString();
                   continue;
                   }
                   if(five.contains(c))
                   {
                       output = builder.append("5").toString();
                   continue;
                   }
                   if(six.contains(c))
                   {
                       output = builder.append("6").toString();
                   continue;
                   }
                   if(seven.contains(c))
                   {
                       output = builder.append("7").toString();
                   continue;
                   }
                   if(eight.contains(c))
                   {
                       output = builder.append("8").toString();
                   continue;
                   }
                   if(nine.contains(c))
                   {
                       output = builder.append("9").toString();
                   continue;
                   }
               }
               
           }
            System.out.println(output);  
            
        }
    }
}
