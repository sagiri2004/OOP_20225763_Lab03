// AddTwoMatrices.java
// 6.6

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 2, 0 },
                { 2, 2 }
        };

        int[][] matrix2 = {
                { 5, 7 },
                { 6, 3 }
        };

        int[][] sumMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Ket qua: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
