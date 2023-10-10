import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue;
    private Queue<Order> orderQueue;

    public Market() {
        this.queue = new LinkedList<>();
        this.orderQueue = new LinkedList<>();
    }

    @Override
    public boolean enqueue(Person person) {
        return queue.offer(person);
    }

    @Override
    public Person dequeue() {
        return queue.poll();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void placeOrder(Order order) {
        orderQueue.offer(order);
    }

    @Override
    public Order takeOrder() {
        return orderQueue.poll();
    }

    public void update() {
        Order order = takeOrder();
        if (order != null) {
            System.out.println("Заказ обработан: " + order.getOrderDetails());
        }
    }
}
