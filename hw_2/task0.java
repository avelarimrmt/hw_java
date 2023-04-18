package hw_2;

public class task0 {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result);
    }
    
    public static String findJewelsInStones(String jewels, String stones) {

        String [] allStones = stones.split("");
        String [] jewelsArr = jewels.split("");
        int count = 0;
        String resultArr = "";

        for (int i = 0; i < jewelsArr.length; i++)  {
            
            for (int j = 0; j < allStones.length; j++) {
                if (allStones[j].indexOf(jewelsArr[i]) != -1)
                    count++;
            }
            if (count != 0) {
                resultArr = resultArr + jewelsArr[i] + count;
                count = 0;
            }
            
        }
    
        return resultArr;
    }
    }