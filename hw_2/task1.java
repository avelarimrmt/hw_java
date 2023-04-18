package hw_2;

public class task1 {

    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
        String s = "cba";
        int[] index = new int[] {3,2,1};
        String result = shuffle(s, index);
        System.out.println(result);
    }
    
    public static String shuffle(final String s, final int[] index){
        String [] arr = s.split("");
        String result = "";
        
        for (int i = 0; i < s.length() / 2; i++) {
            var temp = arr[i];
            arr[i] = arr[index[i] - 1];
            arr[index[i] - 1] = temp;     
        }
        for (int i = 0; i < s.length(); i++) {
            result += arr[i];
        }
        return result;
    }
    }