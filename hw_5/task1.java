package hw_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();

        addPhoneNumber("Иван Иванов", 5454, bookPhone);
        addPhoneNumber("Светлана Петрова", 5452121, bookPhone);
        addPhoneNumber("Кристина Белова", 753465, bookPhone);
        addPhoneNumber("Анна Мусина", 12344, bookPhone);
        addPhoneNumber("Анна Мусина", 2334231, bookPhone);
        addPhoneNumber("Анна Крутова", 425566, bookPhone);
        addPhoneNumber("Анна Крутова", 325235, bookPhone);
        addPhoneNumber("Анна Крутова", 23523, bookPhone);
        addPhoneNumber("Анна Крутова", 3467777, bookPhone);

        printPhoneNumbers(bookPhone);
    }

    public static void addPhoneNumber(String name, int phone, Map<String, ArrayList<Integer>> phones) {
        if (phones.containsKey(name)) {
            phones.get(name).add(phone);
        } 
        else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phone);
            phones.put(name, list);
        }
    }
    public static void printPhoneNumbers(Map<String, ArrayList<Integer>> phones) {
        for (var item : phones.entrySet()) {
            String finalPhones = "";
            for (int elem : item.getValue()) {
                finalPhones = finalPhones + elem + " ";
            }
            System.out.print(item.getKey() + ": ");
            System.out.print(finalPhones + "\n");
        }
    }
}
