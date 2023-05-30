package gr.aueb.cf.ch6;

/**
 * dilwsh arxikopoihshh kai populate
 * pinaka
 */
public class PopulateArray {

    public static void main(String[] args) {

        //dhlwsh kai arxikopoihsh me length
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //enhanced for kyriws an the lomou olo ton pinaka
        for(int item : arr) {
            System.out.print(item + " ");
        }

        //unsized initialization
        int[] arr2 = {1, 5, 8, 9, 12};
        //edw kateytehan dilosh kai arxikopoihsh den ginetai ksexwrista

        //array initializer
        int[] arr3;
        arr3 = new int[] {4, 6, 9, 10};


    }
}
