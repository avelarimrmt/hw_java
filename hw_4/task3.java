package hw_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task3 {
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
    System.out.println(checkOn(deque) == true ? "является палиндромом" : "не является палиндромом");
}

public static boolean checkOn(Deque<Integer> deque){
    for (int i = 0; i < deque.size()/2; i++) {
        if (deque.peekFirst() != deque.peekLast())
            return false;
    }
    return true;
}
}