
import javax.swing.JOptionPane;
import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int mounth 1 or 2: ");
        int mounth = iScanner.nextInt();
           
    String text = "";
    switch(mounth){
        case 1:
            text = "пон";
            
        case 2:
            text = "вт";

        default:
            text = "неправильно";
            break;
    }
    System.out.printf("/n "+text);
    iScanner.close();

        }
}
