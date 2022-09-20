public class Person {

  protected String name;
  protected String lastname;
  protected int tickets;

  public Person (String name, String lastname, int tickets){
    this.name = name;
    this.lastname = lastname;
    this.tickets = tickets;
  }

  public String getName(){
    return name;
  }

  public String getLastname(){
    return lastname;
  }

  public int getTickets(){
    return tickets;
  }

  public void setTickets(int tickets){
    this.tickets = tickets;
  }

}
