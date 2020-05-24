package com.practice.algo;

public class ConnectedCellsInMatrix {
    static int size = 0;

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {0, 1, 0, 1, 1}};
        int rowSize = 5;
        int colSize = 5;
        System.out.println(getMaxConnectedCells(mat, rowSize, colSize));
    }

    private static int getMaxConnectedCells(int[][] mat, int rowSize, int colSize) {
        int maxSize = 0;
        boolean[][] tempMat = new boolean[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mat[i][j] == 1) {
                    size=1;
                    findMaxConnectedCells(mat, i, j, rowSize, colSize, tempMat);
                    maxSize = Math.max(maxSize,size);
                }
            }
        }
        return maxSize;
    }

    private static void findMaxConnectedCells(int[][] mat, int i, int j, int rowSize, int colSize, boolean[][] tempMat) {

        tempMat[i][j] = true;

        int[][] directions = {{-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}};
        for (int p = 0; p < 8; p++) {

            int ni = i + directions[p][0];
            int nj = j + directions[p][1];

            if (isSafe(mat, ni, nj, rowSize, colSize,tempMat)) {
                size++;
                findMaxConnectedCells(mat, ni, nj, rowSize, colSize, tempMat);
            }
        }

    }

    private static boolean isSafe(int[][] mat, int ni, int nj, int rowSize, int colSize, boolean[][] tempMat) {
        return (ni >= 0 && ni < rowSize &&  nj >= 0 && nj < colSize && mat[ni][nj]==1 && tempMat[ni][nj]==false);
    }
}
