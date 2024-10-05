public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = 6;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;

            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 98, 769, 890 };
        System.out.println(binarySearch(arr, 769));

    }
}
