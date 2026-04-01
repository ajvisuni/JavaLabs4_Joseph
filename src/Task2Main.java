public class Task2Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mustang", "Ford", 2022, 55000, "Red", 10);

        System.out.println("Initial state: " + myCar.toString());

        myCar.sell(2);

        System.out.println("\n--- Current Car Details ---");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Quantity: " + myCar.getQuantity());

        myCar.setColor("Blue");
        myCar.setPrice(53000);
        myCar.delivery(5);

        System.out.println("\nFinal state: " + myCar.toString());
    }
}