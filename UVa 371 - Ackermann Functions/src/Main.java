
import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       long ll = 0;
        long ul= 0;

        while (sc.hasNext()) {
            long max = -1;
            long index = -1;
            long tl = sc.nextLong();
            long tu= sc.nextLong();
            
           
            if (tl>tu) {
                ul = tl;
                ll = tu;
            }
            else if (tl<tu) {
                ll = tl;
                ul = tu;
            }
            else  {
                ul = tu;
                ll = tl;
            }
           if (tl == 0 && tu == 0) {
                return;
            }
         else {
                long  i = ll;
                for (i=ll; i<=ul; i++) {

                    h = getHeight(i);
                    if (h>max) {
                        max = h;
                        index = i;
                    }
                    //System.out.println("index is "+i+" and length is "+h);
                }
            }
            System.out.println("Between " + ll + " and " + ul + ", " + index + " generates the longest sequence of " + max + " values.");
        }

    }

    public static long getHeight(long num) {
        h = 0;
       
        if (num%2==0) {
            num/=2;
        } else {
            num = (3*num)+1;
        }
        h++;
         
        while (num!=1) {

            
        if (num%2==0) {
            num/=2;
        } else {
            num = (3*num)+1;
        }
        
        
            h++;
        }

        return h;

    }
    static long h = 0;

}
