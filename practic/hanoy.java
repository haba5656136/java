
public class hanoy {

    public static void main(String[] args) {
        hanoyRecurse("1","2","3",3);
    }

    static void hanoyRecurse(String from, String to, String buf, int count) {
        if (count != 0) {
            hanoyRecurse (from, buf, to, count - 1);
            System.out.printf("[%s] >> [%s] \n", from, to);
            hanoyRecurse (buf, to, from, count - 1);
        }
    }


    

}

