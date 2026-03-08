public class ShippingCostCalculator implements ShippingCostVisitor {

    @Override
    public double visit(Chair chair) {
        return 20.0; // flat rate
    }

    @Override
    public double visit(Table table) {
        return 50.0 + table.getVolume() * 10.0; // based on volume
    }

    @Override
    public double visit(Sofa sofa) {
        return 30.0 + sofa.getWeight() * 2.0 + sofa.getDistance() * 0.5; // weight + distance
    }
}