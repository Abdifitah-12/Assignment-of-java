//Parent class
class FoodOrder {

    // Variables
    protected String dishName;
    protected double basePrice;
    protected int quantity;

    // Constructor
    FoodOrder(String dishName, double basePrice, int quantity) {
        this.dishName = dishName;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    // method get base price
    public double getBasePrice() {
        return basePrice;
    }

    //Display method
    void Display() {
        System.out.println("FoodOrder");
    }
}

//child class1
class DinerInOrder extends FoodOrder {

    //  variable
    private int tableNumber;

    // Constructor
    DinerInOrder(String dishName, double basePrice, int quantity, int tableNumber) {
        super(dishName, basePrice, quantity);   // send 3 values to the parent
        this.tableNumber = tableNumber;         // save the new value
    }

    //
    @Override
    void Display() {
        System.out.println("DinerInOrder");
    }
}

// child class 3
class DeliveryOrder extends FoodOrder {

    // New variable
    private double deliveryFee;

    // Constructor
    DeliveryOrder(String dishName, double basePrice, int quantity, double deliveryFee) {
        super(dishName, basePrice, quantity);   // send 3 values to the parent
        this.deliveryFee = deliveryFee;         // save the new value
    }

    //
    @Override
    void Display() {
        System.out.println("DeliveryOrder");
    }
}