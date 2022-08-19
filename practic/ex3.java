
//треугольное число

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите n ое треугольное число : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int triangleNumber = 0;

            for (int j = 1; j <= i; j++) {
                triangleNumber = triangleNumber + j;
            System.out.print(j+"+"+" ");   //порядок натуральных чисел от 1 до..... 
            }
            
        System.out.println("    = "+ triangleNumber+" точек ");//вывод 
    }
}
}