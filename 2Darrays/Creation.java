import java.util.Scanner;

public class Creation {

    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == key) {
                    return true;

                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // for (int k = 0; k < 3; k++) {
        // for (int l = 0; l < 3; l++) {
        // System.out.println(arr[k][l]);
        // }
        // System.out.println();
        // }

        System.out.println(search(arr, 5));
    }
}
