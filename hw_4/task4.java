package hw_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task4 {
//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    
    System.out.println(sum(d1, d2));
}


public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    Deque<Integer> resultDeq = new ArrayDeque<>();
    int size = d1.size();

    for (int i = 0; i < size; i++) {
        int sumElem = d1.removeFirst() + d2.removeFirst();
        if (sumElem > 9) {
            resultDeq.add(sumElem%10);
            resultDeq.add(sumElem/10);
        }
        else resultDeq.add(sumElem);
    }
    return resultDeq;
}
}
