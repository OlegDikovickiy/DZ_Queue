import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {


  public static void main(String[] args) {
    Queue<Person> queue = new LinkedList<>(generateClients());

    while (!queue.isEmpty()) {
      Person currentPerson = queue.poll();

      int ticket = currentPerson.getTickets();

      if (ticket > 0) {
        currentPerson.setTickets(--ticket);
        System.out.println(currentPerson.getName() + " " + currentPerson.getLastname() + " - прокатился, осталось билетов: " + currentPerson.getTickets());
        queue.offer(currentPerson);
      }
    }
    System.out.println("Очередь пуста");

  }

  protected static List<Person> generateClients() {
    return List.of(
        new Person("Oleg", "Dikovickiy", 1),
        new Person("Nikita", "Ivanov", 1),
        new Person("Marina", "Sokolova", 5),
        new Person("Gleb", "Ershov", 1),
        new Person("Tanya", "Smirnova", 3),
        new Person("Arsen", "Makiyan", 0)
    );
  }
}
