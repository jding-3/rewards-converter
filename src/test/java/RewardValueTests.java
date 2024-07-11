import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000;
        var rewardValue = new RewardValue(cashValue);
        double milesValue = rewardValue.cashToMiles(cashValue);
        assertEquals(1000/0.0035, milesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 500;
        var rewardValue = new RewardValue(miles);
        double cash = rewardValue.milesToCash(miles);
        assertEquals(500*0.0035, cash);
    }
}
