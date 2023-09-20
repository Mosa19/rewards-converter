public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Method to convert from cash to miles
    public double convertFromCashToMiles(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
        return this.milesValue;
    }

    // Method to convert from miles to cash
    public double convertFromMilesToCash(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
        return this.cashValue;
    }
}
