public class Children {
    private static int num_runs;
    private static double girl_prob = 0.5;

    static void Run(int runs) {
        num_runs = runs;

        int kids_total = 0;
        for (int run = 1; run <= num_runs; run++) {
            kids_total += boyAndGirl(girl_prob);
        }
        System.out.println("Probability: " + (double) (kids_total) / num_runs);
    }

    private static int boyAndGirl(double girl_prob) {
        int num_boys = 0, num_girls = 0;
        int count = 0;
        do {
            count++;
            if (Math.random() < girl_prob) {
                num_girls++;
            } else {
                num_boys++;
            }
        } while (num_boys == 0 || num_girls == 0);
        return count;
    }
}
