import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = 1;
        for (int i = b > 0 ? b : -b; i > 0; i--) {
            pow *= a;
        }
        if (a == 0) {
            System.out.print("null");
        } else {
            System.out.print(b > 0 ? pow : (double) 1 / pow);
        }
    }

}
