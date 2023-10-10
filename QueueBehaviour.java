public interface QueueBehaviour {
    boolean enqueue(Person person);
    Person dequeue();
    int size();
}
