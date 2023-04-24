package hw_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task5 {
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>(Arrays.asList("(", ")", "[", "]"));
    System.out.println(deque);
    System.out.println(validate(deque) == true ? "логически правильная строка" : "логически не правильная строка");
}

public static boolean validate(Deque<String> deque){
    int size = deque.size();
    for (int i = 0; i < size/2; i++) {
        char[] tag = deque.peekFirst().toCharArray();
        boolean occClosedTags = false;
        boolean occOpenedTags = deque.removeFirstOccurrence(deque.getFirst());
        switch (tag[0]) {
            case '(': occClosedTags = deque.removeFirstOccurrence(")");
                break;
            case '{': occClosedTags = deque.removeFirstOccurrence("}");
                break;
            case '[': occClosedTags = deque.removeFirstOccurrence("]");
            case ')': return false;
            case '}': return false;
            case ']': return false;  
            default:
                break;
        }
        System.out.println(occClosedTags);
        if (occOpenedTags && occClosedTags)
            return true;
    }
    return false;
}
}
