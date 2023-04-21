package hw_3;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt(); 

        ArrayList<Integer> numbers = new ArrayList<Integer>(size);
        
        System.out.println("Введите элементы списка: ");
        
        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextInt());
        }

        ArrayList<Integer> resultList = removeEvenNumbers(numbers);
        System.out.println(resultList);
        
        scanner.close();
    }

    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0)
                list.remove(i);
        }
        return list;
    }
}
