public class Main {
    public static void main(String[] args) {
        boolean[][] matrix1 = {{true, false}, {false, true}};
        boolean[][] matrix2 = {{false, true}, {true, false}};

        BoolMatrix boolMatrix1 = new BoolMatrix(matrix1);
        BoolMatrix boolMatrix2 = new BoolMatrix(matrix2);

        System.out.println("Initial matrices:");
        System.out.println(boolMatrix1);
        System.out.println(boolMatrix2);

        BoolMatrix orResult = boolMatrix1.or(boolMatrix2);
        BoolMatrix andResult = boolMatrix1.and(boolMatrix2);
        BoolMatrix notResult = boolMatrix1.not();

        System.out.println("OR result:");
        System.out.println(orResult);
        System.out.println("AND result:");
        System.out.println(andResult);
        System.out.println("NOT result:");
        System.out.println(notResult);

        int onesCount = boolMatrix1.countOnes();
        System.out.println("Number of ones in matrix 1: " + onesCount);

        boolMatrix1.sortLexicographically();
        System.out.println("Sorted lexicographically matrix 1:");
        System.out.println(boolMatrix1);
    }
}