/**
 * Program
 * вывод текста на экран
 */
import java.util.Scanner;//ввод с клавиатуры

import javax.management.ValueExp;
import javax.swing.JOptionPane;//ввод с клавиатуры 2

public class Program{
public static void main(String[] args) {
    
    System.out.println("Goodbye world");//вывод текста
    
    short age = 10;
    System.out.println(age); //10

    int salary = 123456;
    System.out.println(salary); //123456

    float e = 2.7f;
    System.out.println(e); //2.7


    double pi = 3.1415;
    System.out.println(pi); //3.1415


    char ch = '1';
    System.out.println(Character.isDigit(ch)); //true
    ch = 'a';
    System.out.println(Character.isDigit(ch)); //false

    String msg = "Hello world";
    System.out.println(msg); //Hello world

    //неявная типизация
    
    var a = 123;
    System.out.println(a); //123
    System.out.println(getType(a)); //Integer
    
    var b = 123.456;
    System.out.println(b); //123.456
    System.out.println(getType(b)); //Double

    //узнать сколько вмещает тип

    System.out.println(Integer.MAX_VALUE); 
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    //МАССИВЫ ОДНОМЕРНЫЕ
    int[] arr = new int[10];
    System.out.println(arr.length);//10
   
    arr = new int[]{1,2,3,4,5};
    System.out.println(arr.length);//5
    
    //МАССИВЫ МНОГОМЕРНЫЕ
    
   /**  int[] array[] = new int[3][5];//массив 3 строки 5 столбцов и с помощью цикла заполняем нулями
   
    for (int [] line : array){
        for (int item : line) {
            System.out.printf("%d", item);
        }
        System.out.println();
    }
    */
  
    int[] array1[] = new int[3][5];//массив 3 строки 5 столбцов и с помощью цикла заполняем нулями
    for(int i = 0; i< array1.length;i++)
    {
        for(int j = 0; j < array1[i].length;j++)
        {
            System.out.printf("%d",array1[i][j]);
        }
        System.out.println();
    }
    //ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА
    //import java.util.Scanner;
    /** 
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("name: ");
    String name = iScanner.nextLine();
    System.out.printf("Пивет,%s!", name);
    iScanner.close();
    */

    //ввод чисел
   /**  Scanner iScanner = new Scanner(System.in);
    System.out.printf("int a: ");
    int x = iScanner.nextInt();
    System.out.printf("%d+%d=%d\n",x,x,x+x);//слэш н нужен для вывода в консоль введеных данных!!!

    iScanner.close();
    */
    
    //import javax.swing.JOptionPane; ВВОД В ОКНЕ!!!возвращает STRING!!!
    
    String namee = JOptionPane.showInputDialog ("What is your name?");
    System.out.println("Hi "+namee+"!");

    //ОПЕРАТОР ВЫБОРА

    Scanner iScanner = new Scanner(System.in);
    System.out.printf("int mounth 1 or 2: ");
    int mounth = iScanner.nextInt();

    String text = "";
    switch (mounth) {
        case 1:
            text = "пон";

        case 2:
            text = "вт";

        default:
            text = "неправильно";
            break;
    }
    System.out.printf("/n " + text);
    iScanner.close();

    


  
}
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }

}

