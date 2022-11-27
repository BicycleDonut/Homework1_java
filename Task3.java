//Реализовал простой калькулятор для для действий с числами из,состоящих из 1 знака.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;

        boolean isExit = false;

        while (!isExit) {
            String[] data = reader.readLine().replaceAll("\\s+", "").split("");
            a = data[0];
            b = data[1];
            c = data[2];


            int q = Integer.parseInt(a);
            int w = Integer.parseInt(c);
            if (b.equals("+")) {
                int d;
                System.out.println(d = q + w);
            }
            if (b.equals("-")) {
                int g;
                System.out.println(g = q - w);
            }
            if (b.equals("/")) {
                int h;
                System.out.println(h = q - w);
            }
            if (b.equals("*")) {
                int l;
                System.out.println(l = q * w);
            }
            isExit = a.equals("exit");

        }
    }
}
