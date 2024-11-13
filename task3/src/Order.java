public class Order {
    private int orderID;
    private OrderStatus status;

    public Order(int orderID) {
        this.orderID = orderID;
        this.status = OrderStatus.NEW;
    }

    public void setStatus(OrderStatus newStatus) {
        if (isValidTransition(newStatus)) {
            this.status = newStatus;
            System.out.println("Статус заказа " + orderID + " изменен на " + newStatus);
        } else {
            System.out.println("Невозможно изменить статус заказа " + orderID + " с " + status + " на " + newStatus);
        }
    }

    private boolean isValidTransition(OrderStatus newStatus) {
        switch (status) {
            case NEW:
                return newStatus == OrderStatus.IN_PROGRESS || newStatus == OrderStatus.CANCELLED;
            case IN_PROGRESS:
                return newStatus == OrderStatus.DELIVERED || newStatus == OrderStatus.CANCELLED;
            case DELIVERED:
                return false;
            case CANCELLED:
                return false;
            default:
                return false;
        }
    }

    public void displayStatus() {
        System.out.println("Заказ " + orderID + " имеет статус: " + status);
    }
}
