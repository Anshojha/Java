
import java.util.*;

public class TicketCounterManagement {

    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.add("Customer 1");
        ticketQueue.add("Customer 2");
        ticketQueue.add("Customer 3");
        System.out.println("Current Queue: " + ticketQueue);
        System.out.println("Processing ticket for: " + ticketQueue.poll());
        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.peek() + " is being served.");
            ticketQueue.remove();
            System.out.println("Queue after serving: " + ticketQueue);
        }
        System.out.println("All customers have been served!");
    }

}
