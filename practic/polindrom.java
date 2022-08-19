//полиндром
import java.util.Scanner;

class polindrom {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String string = sc.nextLine();
            boolean isPalindrom = false;
            for (int i = 0; i < string.length(); i++) {
                int j = string.length() - 1;
                if (string.charAt(i) == (string.charAt(j))) {
                    isPalindrom = true;
                    j--;
                }
                else {
                    System.out.println("No");
                    isPalindrom = false;
                    break;
                }

            }
            if(isPalindrom){
                System.out.print(isPalindrom);
            }
        }
    }
}
