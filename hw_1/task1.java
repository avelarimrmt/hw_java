package hw_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] arr2 = new int[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            boolean flag = true;

            while (flag) {
                System.out.println("Введите целое число от 1 до 1000: ");
                int inputInt = scanner.nextInt();
                if ((inputInt <= 1000) && (inputInt >= 1)) {
                    arr[i] = inputInt;
                    arr2[i] = arr[i] * arr[i] * arr[i];
                    flag = false; 
                }
                else {
                    System.out.println("Введите корректные данные"); 
                    continue;
                }
            }
        }       
        scanner.close();
        

        for (int j : arr2) {
            System.out.println(j);
        }

    }     
}