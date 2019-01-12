public class NumberGame {

    private static void scanMaxAndMin(int[] numbers) {
        int max = numbers[0], min = numbers[0];
        // Your stuff here
        for(int ele : numbers){
            if(ele > max)
                max = ele;
            if(ele < min)
                min = ele;
        }
        System.out.printf("Max is %d and min is %d%n", max, min);
    }

    private static void scanFirstTwoMaxs(int[] numbers) {
        int max = 0, secondMax = 0;
        // Your stuff here
        quickSort(numbers,0,numbers.length - 1);
        max = numbers[numbers.length - 1];
        secondMax = numbers[numbers.length - 2];
        System.out.printf("Max is %d and second max is %d%n", max, secondMax);
    }

    private static void scanFirstThreeMaxs(int[] numbers) {
        int max = 0, secondMax = 0, thirdMax = 0;
        // Your stuff here
        quickSort(numbers,0,numbers.length - 1);
        max = numbers[numbers.length - 1];
        secondMax = numbers[numbers.length - 2];
        thirdMax = numbers[numbers.length - 3];
        System.out.printf("Max is %d, second max is %d and third max is %d%n", max, secondMax, thirdMax);
    }

    private static void threeSums(int[] numbers) {
        int count = 0;
        // Your stuff here
        int first = numbers[0], second = numbers[1], third = numbers[2];
        for(int i = 0; i < numbers.length - 2; ++i)
            for(int j = i + 2; j < numbers.length; ++j){
                if(numbers[i] + numbers[i+1] + numbers[j] == 0)
                    count++;
            }
        System.out.printf("There are %d combinations of 3 numbers that sum of them is 0%n", count);
    }

    public static void main(String[] args) {
        int[] numbers = {-1, -2, 3, -4, -5, 9, 10, 11};
        scanMaxAndMin(numbers);
        scanFirstTwoMaxs(numbers);
        scanFirstThreeMaxs(numbers);
        threeSums(numbers);
    }
    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}
