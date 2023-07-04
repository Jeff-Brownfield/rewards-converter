public class RewardValue {

    private double rewardValue;

    public RewardValue(double cashValue) {
        this.rewardValue = cashValue;
    }

    public RewardValue(int miles) {
        this.rewardValue = miles * 0.0035;
    }

    public double getCashValue() {
        return rewardValue;
    }

    public double getMilesValue() {
        return (int) (rewardValue / 0.0035);
    }
}
