package gr.aueb.cf.ch6;

/**
 * anazhta to elexisto kai megisto
 * stoixeio enos pinaka
 */
public class ArrayMinMax {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};
        int[] arr2 = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = arr2[maxPosition];

        //min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        //max
        for (int i = 1; i < arr2.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr2[i];
            }
        }

        System.out.printf("min value: %d , min position %d\n", minValue, minPosition + 1);
        System.out.printf("max value: %d , max position %d", maxValue, maxPosition + 1);

    }
}
