public class Triangle {
    private static int num_runs;

    static void Run(int runs) {
        num_runs = runs;
        int num_triangles = 0;

        for (int run = 1; run <= num_runs ; run++) {
            double a = Math.random();
            double b = Math.random();

            double s1 = a < b ? a : b;
            double s2 = Math.abs(a - b);
            double s3 = a < b ? 1 - b : 1 - a;

            num_triangles += is_triangle(s1, s2, s3);
        }
        double result = num_triangles == 0 ? 0 : (double)(num_triangles) / num_runs;
        System.out.println("Result: " + result + "%");
    }

    private static int is_triangle(double s1, double s2, double s3) {
        if (Math.max(s1, Math.max(s2, s3)) < 0.5) {
            return 1;
        }
        return 0;
    }
}
