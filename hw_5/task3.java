package hw_5;

public class task3 {
    public static void main(String[] args) {
        int [] array = new int[] {4, 2, 9, 5, 1, 7, 3};

        int [] resultHeapSort = heapSort(array);
        System.out.println("Пирамидальная сортировка: ");
        for (int i = 0; i < resultHeapSort.length ; i++) {
            System.out.print(resultHeapSort[i] + " ");
        }
    }

    public static int [] heapSort(int[] array) {
        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        for (int i = size-1; i >= 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        return array;
    }

    public static void heapify(int array[], int size, int index)
    {
        int maxNode = index;
        int left = 2 * index + 1; 
        int right = 2 * index + 2;

        if (left < size && array[left] > array[maxNode]) {
            maxNode = left;
        }

        if (right < size && array[right] > array[maxNode]) {
            maxNode = right;
        }
       
        if (maxNode != index)
        {
            int swap = array[index];
            array[index] = array[maxNode];
            array[maxNode] = swap;

            heapify(array, size, maxNode);
        }
    }
}