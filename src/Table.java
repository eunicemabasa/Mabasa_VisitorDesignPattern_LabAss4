public class Table implements Furniture {
    private double width, height, length;

    public Table(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getVolume() {
        return width * height * length;
    }

    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}