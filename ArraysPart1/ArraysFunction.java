public class ArraysFunction {
    // arrays are always passed by reference if we change in the function then actua
    // array also gets changed;
    public static void update(int arr[]) {
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        printArray(arr);
        update(arr);
        printArray(arr);
    }
}
