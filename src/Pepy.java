public class Pepy {
    private static int num_runs;

    static void Run(int runs) {
        num_runs = runs;
        System.out.println( "Probability of 1x 1 in 6 rolls : " + probabilityOf(1, 6) );
        System.out.println( "Probability of 2x 1 in 12 rolls: " + probabilityOf(2, 12) );
    }

    private static double probabilityOf(int numberOfOnes, int numberRolls) {
        int count_success = 0;
        for (int run = 1; run <= num_runs ; run++) {
            int count_ones = 0;
            for (int i = 0; i < numberRolls; i++) {
                int die = (int)(Math.random()*6 + 1);
                if (die == 1) {
                    count_ones++;
                    if (count_ones == numberOfOnes) {
                        count_success++;
                        break;
                    }
                }
            }

        }
        return (double)count_success / num_runs;
    }
}
