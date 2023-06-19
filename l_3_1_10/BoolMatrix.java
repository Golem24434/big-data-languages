import java.util.Arrays;
public class BoolMatrix {
    private boolean[][] matrix;
    private int n, m;

    public BoolMatrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new boolean[n][m];
    }

    public BoolMatrix(boolean[][] matrix) {
        this.matrix = matrix;
        n = matrix.length;
        m = matrix[0].length;
    }

    public BoolMatrix(int n, int m, boolean[][] matrix) {
        this.n = n;
        this.m = m;
        this.matrix = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, this.matrix[i], 0, m);
        }
    }

    public BoolMatrix or(BoolMatrix other) {
        if (n != other.n || m != other.m) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        boolean[][] result = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] || other.matrix[i][j];
            }
        }
        return new BoolMatrix(result);
    }

    public BoolMatrix and(BoolMatrix other) {
        if (n != other.n || m != other.m) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        boolean[][] result = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] && other.matrix[i][j];
            }
        }
        return new BoolMatrix(result);
    }

    public BoolMatrix not() {
        boolean[][] result = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = !matrix[i][j];
            }
        }
        return new BoolMatrix(result);
    }

    public int countOnes() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void sortLexicographically() {
        Arrays.sort(matrix, (a, b) -> {
            for (int i = 0; i < m; i++) {
                if (a[i] != b[i]) {
                    return a[i] ? 1 : -1;
                }
            }
            return 0;
        });
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(matrix[i][j] ? "1" : "0");
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}