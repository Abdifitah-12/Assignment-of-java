//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



    FoodOrder order1 = new FoodOrder("Rice", 5.0, 1);
    DinerInOrder order2 = new DinerInOrder("Pizza", 10.5, 2, 5);
    DeliveryOrder order3 = new DeliveryOrder("Burger", 8.0, 3, 1.5);

            order1.Display();
            order2.Display();
            order3.Display();
        }

