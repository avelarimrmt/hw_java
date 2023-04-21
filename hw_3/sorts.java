package hw_3;

public class sorts {
    public static void main(String[] args) {
        int [] array = new int[] {4, 2, 9, 5, 1, 7, 3};

        int [] resultMerge = mergeSort(array);
        int [] resultSelection = selectionSort(array);

        System.out.println("Сортировка слиянием: ");
        for (int i = 0; i < resultMerge.length ; i++) {
            System.out.print(resultMerge[i] + " ");
        }
        System.out.println("\nСортировка выборкой: ");
        for (int i = 0; i < resultSelection.length ; i++) {
            System.out.print(resultSelection[i] + " ");
        }
    }

    public static int [] mergeSort(int[] array) {
        int middle = array.length / 2;

        if (array.length < 2) {
            return array;
        }
        else {
        int [] left = new int[middle];
        System.arraycopy(array, 0, left, 0, middle);

        int [] right = new int[array.length - middle];
        System.arraycopy(array, middle, right, 0, array.length - middle);
            
        return merge(mergeSort(left), mergeSort(right));
        }
    }

    public static int [] append(int[] arr, int element)
    {
        int [] array = new int[arr.length + 1];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length] = element;
        return array;
    }

    public static int [] merge(int[] left, int[] right) {
        int [] result = {};
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
            result = append(result, left[i]);
            i++;
            }
            else {
            result = append(result, right[j]);
            j++;
            }
        }
        while (i < left.length){
            result = append(result, left[i]);
            i++;
        }
        while (j < right.length){
            result = append(result, right[j]);
            j++;
        }
    
        return result;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indMin])
                indMin = j;
            }
            int temp = array[indMin];
            array[indMin] = array[i];
            array[i] = temp;
        }

        return array;
    }

}