public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Person person1 = new Person("Иван");
        Person person2 = new Person("Мария");

        market.enqueue(person1);
        market.enqueue(person2);

        System.out.println("Размер очереди: " + market.size());
        System.out.println("Имя первого человека в очереди: " + market.dequeue().getName());

        Order order1 = new Order("Заказ 1");
        Order order2 = new Order("Заказ 2");

        market.placeOrder(order1);
        market.placeOrder(order2);

        market.update();

        System.out.println("Размер очереди после выдачи заказа: " + market.size());
    }
}