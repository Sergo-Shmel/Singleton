//Реализация статусов заказа:
//Создайте Enum для статусов заказа в интернет-магазине: NEW, IN_PROGRESS, DELIVERED, CANCELLED.
// Реализуйте класс Order, который будет хранить информацию о заказе и текущем статусе,
// а также методы для смены статуса.
//
//Требования:
//
//Определите Enum для статусов заказа.
//Реализуйте методы в классе Order для изменения и отображения статуса заказа.
//Реализуйте логику проверки переходов статусов, чтобы нельзя было отменить доставленный заказ.
public class Main {
    public static void main(String[] args) {
        Order order = new Order(12345);
        order.displayStatus();

        order.setStatus(OrderStatus.IN_PROGRESS);
        order.displayStatus();

        order.setStatus(OrderStatus.DELIVERED);
        order.displayStatus();

        order.setStatus(OrderStatus.CANCELLED); // Попытка отменить доставленный заказ
        order.displayStatus();
    }
}
