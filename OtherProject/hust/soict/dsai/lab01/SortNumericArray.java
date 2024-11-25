// SortNumericArray.java
// 6.5

import java.util.Arrays;

public class SortNumericArray {
    public static void main(String[] args) {
        int[] my_array1 = { 1789, 2035, 1899, 1456, 2013 };

        Arrays.sort(my_array1);

        int sum = 0;

        for (int i = 0; i < my_array1.length; i++) {
            sum += my_array1[i];
        }

        double average = 1.0 * sum / my_array1.length;

        System.out.println("Mang da sap xep: " + Arrays.toString(my_array1));
        System.out.println("Tong: " + sum);
        System.out.println("TB: " + average);
    }
}
