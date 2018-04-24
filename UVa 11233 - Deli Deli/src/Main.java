
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int numOfIrregular = sc.nextInt();
            int queries = sc.nextInt();
            sc.nextLine();
            Map<String, String> map = new HashMap<String, String>();
            for (int i = 0; i < numOfIrregular; i++) {
                String irregular = sc.next();
                String plural = sc.next();
                //System.out.println("irregula is " + irregular + " and plural is " + plural);
                map.put(irregular, plural);
            }
            sc.nextLine();
            for (int i = 0; i < queries; i++) {
                String find = sc.nextLine();
                //System.out.println("word is "+find);
                if (map.containsKey(find) == true) {
                    System.out.println(map.get(find));
                    continue;
                } else {
                    int index = find.length() - 1;
                    //System.out.println("String is "+find+" and index is "+index);
                    StringBuilder builder = new StringBuilder(find);
                    char c = builder.charAt(index);
                    char f = builder.charAt(index-1);
                    if (c == 'y' && (f!='a' && f!='e' && f!='i' && f!='o' && f!='u')) {
                        builder.setCharAt(index, 'i');
                        builder.append("es");
                        System.out.println(builder);

                    } else if (c == 'o' || c == 'x' || c == 's') {
                       
                        builder.append("es");
                        System.out.println(builder);

                    } else if (c == 'h' && (builder.charAt(index - 1) == 'c' || builder.charAt(index - 1) == 's')) {
                        builder.append("es");
                        System.out.println(builder);
                    } else {
                        builder.append("s");
                        System.out.println(builder);
                    }
                }
            }
        }
    }
}
