package week4;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 0, 2}, {-1, 3, 1}}; // A 행렬
        int[][] matrixB = {{3, 1}, {2, 1}, {1, 0}}; // B 행렬
        int[][] result = new int[matrixA.length][matrixB[0].length]; // 결과 행렬

        // 행렬 곱셈
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // 결과 행렬 출력
        System.out.println("행렬 곱셈 결과:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
