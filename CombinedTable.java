public class CombinedTable {
    private SingleTable one;
    private SingleTable two;

    public CombinedTable(SingleTable o, SingleTable t) {
        one = o;
        two = t;
    }

    public boolean canSeat(int num) {
        return one.getNumSeats() + two.getNumSeats() - 2 >= num;
    }

    public double getDesirability() {
        double average = (one.getViewQuality() + two.getViewQuality()) / 2;
        return one.getHeight() == two.getHeight() ? average : average - 10;
    }
}