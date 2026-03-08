public class Client {
    public static void main(String[] args) {
        Furniture[] furnitures = {
                new Chair(10),
                new Table(2, 1, 1.5),
                new Sofa(50, 100)
        };

        ShippingCostVisitor calculator = new ShippingCostCalculator();

        for (Furniture furniture : furnitures) {
            double cost = furniture.accept(calculator);
            System.out.println(furniture.getClass().getSimpleName() + " shipping cost: $" + cost);
        }
    }
}