public class Gambler {
    private static int num_runs;
    private static double ODDS_LOSE   = 0.5;
    private static int    DOLLAR_WIN  = 250;
    private static int    DOLLAR_LOSE = 0;


    static void Run(int runs) {
        num_runs = runs;
        int num_wins = 0;
        int num_rounds_win = 0;
        int num_rounds_lose = 0;

        for (int game = 1; game < num_runs; game++) {
            GamblerResult res = playOneGame();
            if ( res.getIs_win() ) {
                num_wins++;
                num_rounds_win += res.getNum_turns();
            } else {
                num_rounds_lose += res.getNum_turns();
            }
        }

        double prob_win  = (double)num_wins/num_runs;
        double prob_lose = (double)(num_runs-num_wins)/num_runs;
        int avg_round_win  = (int) Math.round( (double)num_rounds_win/num_runs );
        int avg_round_lose = (int) Math.round( (double)num_rounds_lose/num_runs );

        System.out.println( "Probability of winning $" + DOLLAR_WIN  + ": " + prob_win  + " in " + avg_round_win  + " rounds on average"  );
        System.out.println( "Probability of losing  $" + DOLLAR_LOSE + ": " + prob_lose + " in " + avg_round_lose + " rounds on average"  );
    }

    private static GamblerResult playOneGame() {
        boolean is_win;
        int money = 50;
        int num_turns = 0;

        do {
            num_turns++;
            if ( Math.random() > ODDS_LOSE ) { // win
                money++;
            } else {
                money--;
            }
//            System.out.println("DEBUG: " + money);
        } while (money != DOLLAR_LOSE && money != DOLLAR_WIN);

        is_win = (money == DOLLAR_WIN);

        GamblerResult res = new GamblerResult(is_win, num_turns);
        return res;
    }
}
