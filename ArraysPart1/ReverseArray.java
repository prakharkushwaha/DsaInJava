public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverseArray(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        System.out.println("jii");

    }
}
