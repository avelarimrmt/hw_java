package hw_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt(); 

        int array[] = new int[size];

        System.out.println("Введите элементы массива: ");
        
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введите число, на которое нужно умножить элементы массива: ");
        int x = scanner.nextInt(); 

        System.out.print ("Результирующий массив чисел: \n");
        for (int i = 0; i < size; i++) {
            array[i] *= x;
            System.out.println(array[i]);
        }
        scanner.close();
    }
}
