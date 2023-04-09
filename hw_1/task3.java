package hw_1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число ");
        int a = scanner.nextInt(); 

        System.out.println("Введите второе число ");
        int b = scanner.nextInt(); 
        
        System.out.print("Введите операцию: ");
        char op = scanner.next().charAt(0);
        
        int c;
        switch (op) {
            case '+':
                c = a + b;
                System.out.printf("%d + %d = %d",a, b, c);
                break;

            case '-':
                c = a - b;
                System.out.printf("%d - %d = %d",a, b, c);
                break;

            case '*':
                c = a * b;
                System.out.printf("%d * %d = %d",a, b, c);
                break;
        
            default:
                System.out.println("Операция не распознана");
                break;
        }
        
        scanner.close();
    }
}
