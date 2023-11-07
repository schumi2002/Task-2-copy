package shop;

public class LoyalCustomer extends Customer {
    private LoyalCard rewards;

    public LoyalCard getRewards() {
        return rewards;
    }

    public void setRewards(LoyalCard rewards) {
        this.rewards = rewards;
    }
}
