public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 98, 76 };

        int result = linearSearch(arr, 56);
        System.out.println(result);
    }
}
