public class RewardValue {
    double cash;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = miles * 0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return cash * 0.0035;
    }
}
