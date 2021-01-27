public abstract class InsuranceStrategy {
    public double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    protected abstract int getConstant();

    protected abstract double getWeight();

    public abstract int getAdjustment();
}
