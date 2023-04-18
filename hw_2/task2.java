package hw_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int n = inputInt(scanner, "Введите количество строчек в книге: ");
        String [] recipes = new String[n];

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            recipes[i] = inputString(scanner,"Введите строки книги: ");
        }

        int m = inputInt(scanner, "Введите количество продуктов, на которые у человека аллергия: ");
        scanner.nextLine();

        HashMap<String, String> products = new HashMap<>();
        products = productsPair(scanner, m, "Введите строки вида продукт1 - продукт2, \nгде продукт1 - продукт, на который у человека аллергия и \nпродукт2 - продукт, на который следует заменить продукт1: ");
        
        String [] result = replaceProducts(products, recipes);
     
        for (String string : result) {
            System.out.println(string);
        }

        scanner.close();
    }

    public static Integer inputInt(Scanner scanner, String txt) {
        System.out.printf(txt);
        return scanner.nextInt();
    }

    public static String inputString(Scanner scanner, String txt) {
        System.out.printf(txt);
        return scanner.nextLine();
    }
    
    public static HashMap<String, String> productsPair(Scanner scanner, int m, String txt){
        HashMap<String, String> replacements = new HashMap<>();
        System.out.println(txt);
        for (int i = 0; i < m; i++)
        {
            String[] pair = scanner.nextLine().split(" - ");
            replacements.put(pair[0], pair[1]);
        }

        return replacements;
    }

    public static String[] replaceProducts(HashMap<String, String> products, String[] recipes){
        for (int i = 0; i < recipes.length; i++) {
            var recipe = recipes[i];
            for (Map.Entry<String, String> entry : products.entrySet())
            {
                String firstProduct = entry.getKey();
                String lastProduct = entry.getValue();

                recipe = recipe.replaceAll(firstProduct, lastProduct);
                recipe = recipe.replaceAll(firstProduct.substring(0, 1).toUpperCase() + firstProduct.substring(1), lastProduct.substring(0, 1).toUpperCase() + lastProduct.substring(1));
            }
            recipes[i] = recipe;
        }

        return recipes;
    }
}


