public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    protected int getConstant() {
        return 76500;
    }

    @Override
    protected double getWeight() {
        return 0.1;
    }

    @Override
    public int getAdjustment() {
        return 30000;
    }
}
