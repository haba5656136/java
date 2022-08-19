

import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();
        System.out.println("Enter c ");
        int c = sc.nextInt();
        System.out.println("Enter d ");
        int d = sc.nextInt();
        k(a, b, c, d, "");
    }

    public static void k(int a, int b, int c, int d, String outStr) {
        if (a > b) {
            System.out.println("нет решения " + outStr);
            return;
        }
        if (a == b){
            System.out.println("решение " + outStr);
            return;
        }
        if (c != 0){
            k(a + c, b, c, d, outStr + " k1");
        }

        if (d != 0 && d != 1) {
            k(a * d, b, c, d, outStr + " k2");
        }
    }

}
