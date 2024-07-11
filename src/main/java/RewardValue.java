public class RewardValue {
    double cash;
    static final double milesToCash = 0.0035;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = miles * milesToCash;
    }

   public double milesToCash(int miles){
        return miles * milesToCash;
   }

   public double cashToMiles(double cash){
        return cash/milesToCash;
   }

   public double getCashValue(){
        return cash;
   }

   public double getMilesValue(){
        return cashToMiles(this.cash);
   }
}
