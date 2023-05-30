package gr.aueb.cf.ch6;

public class ArrayMinWithMaxInt {

    public static void main(String[] args) {
        int[] arr = {6, 90, 4, 17};

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("min value: %d, min position: %d", minValue, minPosition + 1);
    }
}
