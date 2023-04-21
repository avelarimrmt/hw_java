package hw_3;

import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt(); 

        ArrayList<Integer> numbers = new ArrayList<Integer>(size);
        
        System.out.println("Введите элементы списка: ");
        
        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Минимальный элемент в списке");
        int min = minElementList(numbers);
        System.out.println(min);

        System.out.println("Максимальный элемент в списке");
        int max = maxElementList(numbers);
        System.out.println(max);

        System.out.println("Средний элемент в списке");
        double average = averageList(numbers);
        System.out.println(average);
        
        scanner.close();
    }

    public static int minElementList(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int maxElementList(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static double averageList(ArrayList<Integer> list) {
        double average = 0;
        double sum = 0;
        
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        average = sum / list.size();
        return average;
    }
}
