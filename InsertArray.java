import java.util.Arrays;

public class InsertArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int index = 4;
        int element = 35;

        int[] newArr = new int[arr.length + 1];

    
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        
        newArr[index] = element;

        
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        
        System.out.println("Array after insertion:");
        System.out.println(Arrays.toString(newArr));
    }
}
