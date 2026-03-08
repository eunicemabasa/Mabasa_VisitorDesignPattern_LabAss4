public class Sofa implements Furniture {
    private double weight, distance;

    public Sofa(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}