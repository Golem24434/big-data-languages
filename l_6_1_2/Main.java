public class Main {
    public static void main(String[] args) {
        int n = 10;
        double[] I = {1.2, 2.1, 3.7, 4.5, 5.6, 6.8, 7.4, 8.2, 9.0, 10.1};
        double[] U = {2.1, 3.4, 4.9, 6.0, 7.5, 9.1, 10.2, 11.8, 12.5, 14.3};

        double avgI = 0;
        double avgU = 0;
        for (int i = 0; i < n; i++) {
            avgI += I[i];
            avgU += U[i];
        }
        avgI /= n;
        avgU /= n;

        double sumProd = 0;
        double sumSqrU = 0;
        for (int i = 0; i < n; i++) {
            sumProd += (I[i] - avgI) * (U[i] - avgU);
            sumSqrU += Math.pow(U[i] - avgU, 2);
        }

        double R = sumProd / sumSqrU;

        System.out.println("R = " + R);
    }
}