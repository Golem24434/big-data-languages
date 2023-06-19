public class Main {
    private double a;
    private double b;
    private double c;

    public Main(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Main(double a, double b) {
        this(a, b, 0);
    }

    public Main(double a) {
        this(a, 0, 0);
    }

    public double[] findRoots() {
        double[] roots = new double[2];
        try {
            roots = new double[2];
        } catch (OutOfMemoryError e) {
            // Обработка исключения при нехватке памяти
            System.err.println("Ошибка: недостаточно памяти для выделения массива");
        }
        double discriminant = b * b - 4 * a * c;
        try {
            if (discriminant > 0) {
                roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
                roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            } else if (discriminant == 0) {
                roots[0] = -b / (2 * a);
                roots[1] = roots[0];
            } else {
                throw new Exception("Отрицательный дискриминант");
            }
        } catch (Exception e) {
            // Обработка исключения при отрицательном значении дискриминанта
            System.err.println(e.getMessage());
        }
            return roots;
        }

    public double findMinimum() {
        double vertexX = -b / (2 * a);
        double vertexY = a * vertexX * vertexX + b * vertexX + c;
        if (a > 0) {
            return vertexY;
        } else {
            double y1 = a * Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY + b * Double.NEGATIVE_INFINITY + c;
            double y2 = a * Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY + b * Double.POSITIVE_INFINITY + c;
            return Math.min(y1, Math.min(y2, vertexY));
        }
    }

    public double findMaximum() {
        double vertexX = -b / (2 * a);
        double vertexY = a * vertexX * vertexX + b * vertexX + c;
        if (a < 0) {
            return vertexY;
        } else {
            double y1 = a * Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY + b * Double.NEGATIVE_INFINITY + c;
            double y2 = a * Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY + b * Double.POSITIVE_INFINITY + c;
            return Math.max(y1, Math.max(y2, vertexY));
        }
    }

    public boolean isIncreasing() {
        return a > 0;
    }

    public boolean isDecreasing() {
        return a < 0;
    }

    public static void main(String[] args) {
        Main[] equations = new Main[3];
        equations[0] = new Main(1, 2, -3);
        equations[1] = new Main(2, -5);
        equations[2] = new Main(-3);

        double maxRoot = Double.NEGATIVE_INFINITY;
        double minRoot = Double.POSITIVE_INFINITY;
        for (Main equation : equations) {
            double[] roots = equation.findRoots();
            for (double root : roots) {
                if (!Double.isNaN(root)) {
                    maxRoot = Math.max(maxRoot, root);
                    minRoot = Math.min(minRoot, root);
                }
            }
        }
        System.out.println("Max root: " + maxRoot);
        System.out.println("Min root: " + minRoot);
        System.out.println("Minimum: " + equations[0].findMinimum());
    }
}