public class GamblerResult {
    private boolean is_win;
    private int num_turns;

    public GamblerResult(boolean is_win, int num_turns) {
        this.is_win = is_win;
        this.num_turns = num_turns;
    }

    public boolean getIs_win() {
        return is_win;
    }

    public int getNum_turns() {
        return num_turns;
    }
}


