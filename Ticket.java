import java.util.HashMap;
import java.util.Scanner;

class Ticket {
    private int ticketId;
    private String passengerName;
    private String source;
    private String destination;
    private String travelDate;

    public Ticket(int ticketId, String passengerName, String source, String destination, String travelDate) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.travelDate = travelDate;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String name) {
        this.passengerName = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String toString() {
        return "Ticket ID: " + ticketId + ", Name: " + passengerName + ", From: " + source +
               ", To: " + destination + ", Date: " + travelDate;
    }
}


class TicketApp {
    private HashMap<Integer, Ticket> tickets = new HashMap<>();
    
        public void addTicket(Ticket t) {
        tickets.put(t.getTicketId(), t);
    }

    public Ticket getTicket(int ticketId) {
        return tickets.get(ticketId);
    }

    public boolean updateTicket(int ticketId, String newName, String newSource, String newDestination, String newDate) {
        Ticket t = tickets.get(ticketId);
        if (t != null) {
            t.setPassengerName(newName);
            t.setSource(newSource);
            t.setDestination(newDestination);
            t.setTravelDate(newDate);
            return true;
        }
        return false;
    }

    public boolean cancelTicket(int ticketId) {
        return tickets.remove(ticketId) != null;
    }

    public void displayAllTickets() {
        for (Ticket t : tickets.values()) {
            System.out.println(t);
        }
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketApp app = new TicketApp();
        int choice;

        do {
            System.out.println("\n Ticket App");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. View Ticket by ID");
            System.out.println("4. Update Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                     System.out.print("How many ticket do you want to book: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nBooking Ticket: " + (i + 1));
    
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Passenger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Source: ");
                    String source = sc.nextLine();
                    System.out.print("Destination: ");
                    String destination = sc.nextLine();
                    System.out.print("Travel Date: ");
                    String date = sc.nextLine();
                    app.addTicket(new Ticket(id, name, source, destination, date));
        }
                    break;

                case 2:
                    app.displayAllTickets();
                    break;

                case 3:
                    System.out.print("Enter Ticket ID: ");
                    int viewId = sc.nextInt();
                    Ticket viewTicket = app.getTicket(viewId);
                    if (viewTicket != null)
                        System.out.println(viewTicket);
                    else
                        System.out.println("Ticket not found.");
                    break;

                case 4:
                    System.out.print("Enter Ticket ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Source: ");
                    String newSource = sc.nextLine();
                    System.out.print("New Destination: ");
                    String newDest = sc.nextLine();
                    System.out.print("New Date: ");
                    String newDate = sc.nextLine();
                    if (app.updateTicket(updateId, newName, newSource, newDest, newDate))
                        System.out.println("Ticket updated.");
                    else
                        System.out.println("Ticket not found.");
                    break;

                case 5:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int cancelId = sc.nextInt();
                    if (app.cancelTicket(cancelId))
                        System.out.println("Ticket cancelled.");
                    else
                        System.out.println("Ticket not found.");
                    break;

                case 6:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}