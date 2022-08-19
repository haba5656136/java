
public class ex5 {
    public static void main(String[] args) {
        String str = "2?+?5 =6?";
        int[] arr = new int[3];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int j2 = 0; j2 < 9; j2++) {

                    arr[0] = i;
                    arr[1] = j;
                    arr[2] = j2;

                    int a = Integer.parseInt("2" + i);
                    int c = Integer.parseInt(j + "5");
                    int b = Integer.parseInt("6" + j2);
                    if (a + c == b) {
                        System.out.println("2" + i + "+" + j + "5" + "=" + "6" + j2);

                    }

                }

            }
        }
    }
}
