//пирамидальная сортировка HeapSort

import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int [] arr = new int[] {22,31,32,87,55,43,58,999,67,3,2,5,7,4,6,9,8,1,0}; //{8 ,5 ,6 ,3, 1 ,2 ,4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
   
    static void heap(int[] array, int length, int i) {  
        int leftChild = 2*i+1;//2
        int rightChild = 2*i+2;//4
        int max = i;//0
    
        // если левый дочерний больше родительского кладем значение в max
        if (leftChild < length && array[leftChild] > array[max]) {
            max = leftChild;
        }
    
        // если правый дочерний больше родительского кладем значение в max
        if (rightChild < length && array[rightChild] > array[max]) {
            max = rightChild;
        }
    
        // если должна произойти замена
        if (max != i) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            heap(array, length, max);
        }
    }
    
    public static void Sort(int[] array) {  
        if (array.length == 0) return;
    
        // Строим кучу
        int length = array.length;
        // проходим от первого без ответвлений к корню
        for (int i = length / 2-1; i >= 0; i--)
            heap(array, length, i);
    
        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
    
            heap(array, i, 0);
        }
    }
}
