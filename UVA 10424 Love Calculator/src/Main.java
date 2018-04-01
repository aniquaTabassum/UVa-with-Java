
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String io = "";
            String it = "";
            String io1 = sc.nextLine();
            String it1 = sc.nextLine();
            io1 = io1.toLowerCase();
            it1 = it1.toLowerCase();
            for (int i = 0; i < io1.length(); i++) {
                char c = io1.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    io += c;

                }
            }

            for (int i = 0; i < it1.length(); i++) {
                char c = it1.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    it += c;
                }
            }
            System.out.println(io+" "+it);
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            map.put('a', 1);
            map.put('b', 2);
            map.put('c', 3);
            map.put('d', 4);
            map.put('e', 5);
            map.put('f', 6);
            map.put('g', 7);
            map.put('h', 8);
            map.put('i', 9);
            map.put('j', 10);
            map.put('k', 11);
            map.put('l', 12);
            map.put('m', 13);
            map.put('n', 14);
            map.put('o', 15);
            map.put('p', 16);
            map.put('q', 17);
            map.put('r', 18);
            map.put('s', 19);
            map.put('t', 20);
            map.put('u', 21);
            map.put('v', 22);
            map.put('w', 23);
            map.put('x', 24);
            map.put('y', 25);
            map.put('z', 26);
            int sumio = 0;
            int sumit = 0;
            for (int i = 0; i < io.length(); i++) {
                char c = io.charAt(i);
                sumio += map.get(c);
            }

            int temp = sumio;
            while (temp > 9) {
                int s = 0;
                String b = String.valueOf(temp);

                for (int i = 0; i < b.length(); i++) {
                    char c = b.charAt(i);

                    s += c - '0';
                }
                temp = s;

            }

            for (int i = 0; i < it.length(); i++) {
                char c = it.charAt(i);
                sumit += map.get(c);
            }

            int temp2 = sumit;
            while (temp2 > 9) {
                int s = 0;
                String b = String.valueOf(temp2);

                for (int i = 0; i < b.length(); i++) {
                    char c = b.charAt(i);

                    s += c - '0';
                }
                temp2 = s;

            }

            double fin1 = temp;
            double fin2 = temp2;
            double fin = (fin1 > fin2) ? (fin2 / fin1) : (fin1 / fin2);
            fin *= 100;
            System.out.format("%.2f", fin);
            System.out.println(" %");
        }
    }
}
