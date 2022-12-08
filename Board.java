public class Board {
    private int pile;
    public Board (int pileCount) {
        pile = pileCount;
    }

    public void cutPile (int num) {
        if (num > pile / 2) {
            System.out.println("You can't remove more than half the pile.");
        } else if (num >= pile) {
            System.out.println("You must remove at least one piece.");
        }
    }
}
