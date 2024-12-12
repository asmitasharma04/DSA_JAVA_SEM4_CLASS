import java.util.Arrays;

public class delete_array {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int index = 4; 

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for (int i = index; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

       
        System.out.println("Array after deletion:");
        System.out.println(Arrays.toString(newArr));
    }
}
