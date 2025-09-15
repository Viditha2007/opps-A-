package scenarioBasedPrograms;
//Abstract class
abstract class FoodOrder {
 int orderId;
 double amount;
 FoodOrder(int orderId, double amount) {
     this.orderId = orderId;
     this.amount = amount;
 }
 abstract double calculateTotal();

 void generateBill() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Total Bill: " + calculateTotal());
 }
}

class RestaurantOrder extends FoodOrder {
 RestaurantOrder(int orderId, double amount) {
     super(orderId, amount);
 }

 @Override
 double calculateTotal() {
     return amount + (amount * 0.05); 
 }
}

class CloudKitchenOrder extends FoodOrder {
 CloudKitchenOrder(int orderId, double amount) {
     super(orderId, amount);
 }

 @Override
 double calculateTotal() {
     return amount + 30; 
 }
}
public class FoodDeliveryApp {
 public static void main(String[] args) {
     FoodOrder order1 = new RestaurantOrder(101, 500);
     order1.generateBill();

     FoodOrder order2 = new CloudKitchenOrder(102, 300);
     order2.generateBill();
 }
}
