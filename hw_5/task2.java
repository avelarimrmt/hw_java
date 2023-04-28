package hw_5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String[] emp = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

		Map<String, Integer> map = new HashMap();

        for (int i = 0; i < emp.length; i++) {
            String[] arr = emp[i].split(" ");
            if (map.containsKey(arr[0])) {
                map.put(arr[0], map.get(arr[0]) + 1);
            }
            else {
                map.put(arr[0], 1);
            }
        }

        Map<String, Integer> rplMap = new HashMap<String, Integer>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                rplMap.put(entry.getKey(), entry.getValue());
            }
        }

        rplMap.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .forEach(System.out::println);
    }
}