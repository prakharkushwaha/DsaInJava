
/**
 * maxinArray
 */

public class MaxinArray {

    public static void maxOfArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }
        System.out.println(largest);

    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 98, 76 };
        System.out.println("hi");
        maxOfArray(arr);
    }

}