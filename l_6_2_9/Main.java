public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 2, 4},
                {5, 2, 2, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int maxCount = 0;
        int maxI = -1;
        int maxJ = -1;
        int maxSizeI = -1;
        int maxSizeJ = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int sizeI = 1; sizeI <= matrix.length - i; sizeI++) {
                    for (int sizeJ = 1; sizeJ <= matrix[i].length - j; sizeJ++) {
                        int count = countEqualElements(matrix, i, j, sizeI, sizeJ);

                        if (count > maxCount) {
                            maxCount = count;
                            maxI = i;
                            maxJ = j;
                            maxSizeI = sizeI;
                            maxSizeJ = sizeJ;
                        }
                    }
                }
            }
        }

        if (maxCount > 0) {
            System.out.println("Max count: " + maxCount);
            System.out.println("Submatrix:");

            for (int i = maxI; i < maxI + maxSizeI; i++) {
                for (int j = maxJ; j < maxJ + maxSizeJ; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No equal elements found");
        }
    }

    private static int countEqualElements(int[][] matrix, int i, int j, int sizeI, int sizeJ) {
        int count = 0;
        int element = matrix[i][j];

        for (int ii = i; ii < i + sizeI; ii++) {
            for (int jj = j; jj < j + sizeJ; jj++) {
                if (matrix[ii][jj] == element) {
                    count++;
                }
            }
        }

        return count;
    }
}