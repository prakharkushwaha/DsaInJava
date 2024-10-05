public class FirstOccurrence {
    public static int print(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return print(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6 };
        System.out.println(print(arr, 5, 0));

    }

}
